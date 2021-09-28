package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 2 numbers");
        double numInput1 = input.nextInt();
        double numInput2 = input.nextInt();
        double divisonNum = numInput1 / numInput2;
        double modNum = numInput1 % numInput2;
        System.out.println("your numbers dived to make" +(divisonNum));
        System.out.println("your numbers modded to make" +(modNum));
    }
}
