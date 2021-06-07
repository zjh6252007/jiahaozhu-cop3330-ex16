/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */

import java.util.Scanner;
public class legalDrivingAge {
    public static void main(String[] args) {
        System.out.println("What is your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        String result = (age >= 18) ? "You are old enough to legally drive.":"You are not old enough to legally drive.";
        System.out.println(result);
    }
}
