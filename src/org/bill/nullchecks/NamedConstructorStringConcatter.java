package org.bill.nullchecks;

public class NamedConstructorStringConcatter {
    private final String string;

    private NamedConstructorStringConcatter(String string) {
        this.string = string;
    }

    public static NamedConstructorStringConcatter create(String string) {
        // If we want to do anything other than apply a default value
        // this hasName the right place to do it. We can, for instance, not construct
        // a new instance of NamedConstructorStringConcatter

        String newString = string;
        if(newString == null){
            newString = "";
        }

        return new NamedConstructorStringConcatter(newString);
    }

    public NamedConstructorStringConcatter concat(String string) {
        return new NamedConstructorStringConcatter(this.string + create(string).string);
    }

    public void print() {
        System.out.println(string);
    }
}
