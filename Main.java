package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user0 = new Scanner(System.in);
        System.out.println("Enter Your Name:"  + "\t");
        String name = user0.nextLine();

        Scanner user1 = new Scanner(System.in);
        System.out.println("Enter Your Name:"  + "\t");
        String name1 = user1.nextLine();
        System.out.println("Your Name: " + name + "\t");

        System.out.println("Your Name: " + name1  + "\t");
    }
}
