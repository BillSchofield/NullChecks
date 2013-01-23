package org.bill.nullchecks;

public class Main {

    public static void main(String[] args) {
        testNullChecked(null);
        testNullChecked("Test1");

        testNotNullChecked(null);
        testNotNullChecked("Test2");

        testNamedConstructor(null);
        testNamedConstructor("Test3");


        ThingFinder thingFinder = new ThingFinder(new Thing("Thing1"), new Thing("Thing2"));
        thingFinder.find("Thing3").print();
        thingFinder.find("Thing2").print();
    }

    private static void testNullChecked(String stringToTest) {
        NullCheckedStringConcatter nullCheckedStringConcatter = new NullCheckedStringConcatter();
        nullCheckedStringConcatter.setString(stringToTest);
        nullCheckedStringConcatter.concat(stringToTest);
        nullCheckedStringConcatter.print();
    }

    private static void testNotNullChecked(String stringToTest) {
        new NotNullCheckedStringConcatter(stringToTest).concat(stringToTest).print();
    }

    private static void testNamedConstructor(String stringToTest) {
        NamedConstructorStringConcatter.create(stringToTest).concat(stringToTest).print();
    }
}
