package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is the first number?");
        num1 = sc.nextInt();
        System.out.println("What is the second number?");
        num2 = sc.nextInt();

        //output
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2) + "\n" + num1 + " - " + num2 + " = " + (num1-num2) + "\n" + num1 + " * " + num2 + " = " + (num1*num2) + "\n" + num1 + " / " + num2 + " = " + (num1/num2));

        //closer scanner
        sc.close();
    }
}
