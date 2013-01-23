package org.bill.nullchecks;

public class Thing {
    private final String name;
    public final static Thing Null = new Thing("Thing not found");

    public Thing(String name) {
        this.name = name;
    }

    public boolean hasName(String name) {
        return this.name.equals(name);
    }

    public void print() {
        System.out.println(name);
    }
}
