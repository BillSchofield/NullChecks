package org.bill.nullchecks;

public class NotNullCheckedStringConcatter {
    private final String string;

    public NotNullCheckedStringConcatter(String string) {
        String newString = string;
        if (newString == null){
            newString = "";
        }
        this.string = newString;
    }

    public NotNullCheckedStringConcatter concat(String string) {
        return concat(new NotNullCheckedStringConcatter(string));
    }

    private NotNullCheckedStringConcatter concat(NotNullCheckedStringConcatter stringConcatter) {
        return new NotNullCheckedStringConcatter(this.string + stringConcatter.string);
    }

    public void print() {
        System.out.println(string);
    }
}
