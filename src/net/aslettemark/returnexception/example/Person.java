package net.aslettemark.returnexception.example;

import net.aslettemark.returnexception.ReturnException;

public class Person {

    private String name;

    public static void main(String[] args) {
        Person aksel = new Person();
        aksel.setName("Aksel");
        String returnName = null;
        try {
            aksel.getName();
        } catch (ReturnException e) {
            returnName = (String) e.getValue();
        }
        if (returnName.equals("Aksel")) {
            System.out.println("Huge success, got return value " + returnName + " from a method with no declared return type!");
        } else {
            System.out.println("The joke is on me this year.");
        }
    }

    public void getName() throws ReturnException {
        throw new ReturnException(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
