package com.example.sales_record;

import java.util.Scanner;

public class salesrecord {
    public static void main(String[] args) {
        String custnum, name, taxcode;
        double salesamt;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Customer Number : ");
        custnum = keyboard.next();

        System.out.print("Name : ");
        name = keyboard.next();

        System.out.print("Sales amount : $");
        salesamt = keyboard.nextDouble();

        System.out.print("Tax Code : ");
        taxcode = keyboard.next();

        if (taxcode.equals("NRM"))
            System.out.println("Total (with tax) : $" + (salesamt * 1.06));
        else if (taxcode.equals("NPF"))
            System.out.println("Total (with tax) : $" + (salesamt * 1));
        else if (taxcode.equals("BIZ"))
            System.out.println("Total (with tax) : $" + (salesamt * 1.04555));
    }
}
