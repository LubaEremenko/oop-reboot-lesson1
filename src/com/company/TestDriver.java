package com.company;

public class TestDriver {
    public static void run(){
        testCar();
        testPerson();
        testShop();
        testInvoiceItem();
        testInvoice();

    }
    private static void testInvoice(){
        Invoice i = new Invoice("1234");
        System.out.println("Invoice number is " + i.getNumber());
    }

    public static void testInvoiceItem() {
        InvoiceItem i = new InvoiceItem(  "apple" );
        System.out.println("Invoice item is " + i.getName());

        InvoiceItem item2 = new InvoiceItem( "orange", 3 , 4);
        System.out.println(item2.toString());


    }


    public static void testPerson() {
       // create an instance of the class . it becomes an object

        Person p = new Person("Luba");
        System.out.println("Person name is " + p.getName());
        p.setAge(25);
        System.out.println("The age is " +p.getAge());

    }

    public static void testCar() {
        Car c = new Car(   "Volvo");
        //System.out.println("The manufacturer is " + c.getManufacturer());
        System.out.println(c.toString());

        Car c2 = new Car("BMW");
       // System.out.println("The manufacturer is " + c2.getManufacturer());
        System.out.println(c2.toString());

    }

    public static void testShop() {
        Shop s = new Shop("Spar");
         System.out.println("The shop name is " + s.getName());

    }

}




