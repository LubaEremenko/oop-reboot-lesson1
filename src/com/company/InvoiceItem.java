package com.company;

public class InvoiceItem {

  private String name;
  private int quantity;
  private float price;

    public InvoiceItem(String _name) {
        name = _name;
        System.out.println("Item is created");

    }

    public InvoiceItem(String _name, int _price, int _quantity) {
        name = _name;
        price = _price;
        quantity = _quantity;

    }

    public String getName() {
        return name;
    }
    @Override

    public String toString(){
        return String.format("Invoice item details: |Name:" + name + "|Price:" + price + "|Quantity:" + quantity);

    }


   // public int getQuantity() {
 //       return quantity;
 //   }

    }
