/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        double item1, item2, item3, subtotal, tax, total;
        double quant1, quant2, quant3;
        double taxRate = 0.055;
        String strItem1, strItem2, strItem3, strQuant1, strQuant2, strQuant3;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the price of item 1: ");
        strItem1 = sc.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        strQuant1 = sc.nextLine();

        System.out.print("Enter the price of item 2: ");
        strItem2 = sc.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        strQuant2 = sc.nextLine();

        System.out.print("Enter the price of item 3: ");
        strItem3 = sc.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        strQuant3 = sc.nextLine();

        item1 = Double.parseDouble(strItem1);
        item2 = Double.parseDouble(strItem2);
        item3 = Double.parseDouble(strItem3);

        quant1 = Double.parseDouble(strQuant1);
        quant2 = Double.parseDouble(strQuant2);
        quant3 = Double.parseDouble(strQuant3);

        subtotal = (item1 * quant1) + (item2 * quant2) + (item3 * quant3);
        tax = subtotal * taxRate;
        total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}
