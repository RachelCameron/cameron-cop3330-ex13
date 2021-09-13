/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        double principal = input.nextDouble();
        System.out.println("What is the rate as a percentage?");
        double interestrate = (input.nextDouble()/100);
        System.out.println("What is the number of years?");
        double time = input.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        double compoundint = input.nextDouble();
        double total = principal * Math.pow((1 + interestrate/compoundint), (compoundint*time));
        System.out.printf("$%.2f invested at %.2f percent for %.0f years compounded %.2f times per year is $%.2f.", principal, interestrate * 100, time, compoundint, total);
    }
}