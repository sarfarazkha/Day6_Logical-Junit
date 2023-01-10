package com.bridgelabz.Junit;

import java.util.Scanner;

public class Util {
    static float tempConvert(float temp, char deg) {
        if (deg == 'c')
            return (temp * 9 / 5) + 32;
        else
            return (temp - 32) * 5 / 9;
    }

    public static void monthlyPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p yr : ");
        double P = sc.nextDouble();
        double Y = sc.nextDouble();
        double R = sc.nextDouble();
        double n = Y * 12;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow((1 + r), -1 / n));
        System.out.println(payment);
    }


    public static void temperatureConversion() {
        System.out.print("Enter temperature : ");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();

        System.out.print("Enter c for celsius and f for fahrenheit : ");
        char deg = sc.next().charAt(0);
        float res = (tempConvert(temp, deg));
        if (deg == 'c')
            System.out.println("temperature in fahrenheit is " + res);
        else
            System.out.println("temperature in celsius is " + res);

    }

    public static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(" " + (num >> i & 1));
        }
        System.out.printf("\n");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printBinary(num);
        scanner.close();
        monthlyPayment();
        temperatureConversion();
       // SqrtNewton

        System.out.println("Enter the non negative number");
        scanner.close();
        double c = Double.parseDouble(args[0]);
        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (t + c / t) / 2;
        }
        System.out.printf("the sqrt of given number %1.3f is %1.3f ", c, t);



    }
}
