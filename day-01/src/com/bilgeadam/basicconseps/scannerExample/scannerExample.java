package com.bilgeadam.basicconseps.scannerExample;

import java.util.Scanner;

public class scannerExample {

    public static void main(String[] args) {

        System.out.println("How many dollar do you have?");
        Scanner scanner = new Scanner(System.in);
        double dollarAmount = scanner.nextDouble();

        double turkishLiraValue= 17.77;

        System.out.println(dollarAmount + "$ equals to " + dollarAmount*turkishLiraValue + "₺");
    }
}