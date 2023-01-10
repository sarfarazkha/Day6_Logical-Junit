package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.print("Enter n to find whether it is a prime number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int j=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                j++;
                if(j==2)
                    break;
            }
        }
        if(j==1)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}
