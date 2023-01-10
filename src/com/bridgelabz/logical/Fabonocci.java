package com.bridgelabz.logical;

import java.util.Scanner;

public class Fabonocci {
    public static void main(String[] args) {
        System.out.print("Enter n to find the last number in fibonacci series ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a=0,b=1,num=0;

        System.out.print(0 +" "+1+" ");
        for(int i=1;i<n-1;i++){
            num=a+b;
            System.out.print(num+" ");
            a=b;
            b=num;
        }
    }
}
