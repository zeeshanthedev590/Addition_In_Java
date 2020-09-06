package com.company;

import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        // Question # 1 Addition Of Three Numbers
        int num1, num2, num3, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = sc.nextInt();
        System.out.print("Enter Third Number : ");
        num3 = sc.nextInt();

        result = num1 + num2 + num3;
        System.out.println("The Result Is " + result);
        sc.close();

    }

}