package org.bill.nullchecks;

public class NullCheckedStringConcatter {
    private String string;

    public NullCheckedStringConcatter() {
    }

    public void setString(String string) {
        this.string = string;
    }

    public void concat(String string){
        if (string == null){
            string = "";
        }

        if (this.string == null){
            this.string = string;
        } else {
            this.string += string;
        }
    }

    @Override
    public String toString(){
        if (string == null){
            return "";
        }
        return string;
    }

    public void print() {
        if (string == null){
            string = "";
        }
        System.out.println(string);
    }
}
