package net.aslettemark.returnexception;

public class ReturnException extends Exception {

    private Object value;

    public ReturnException(Object value) {
        super("Return value: " + value);
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

}
