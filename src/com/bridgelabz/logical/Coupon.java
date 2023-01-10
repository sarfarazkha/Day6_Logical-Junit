package com.bridgelabz.logical;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {

        System.out.print("Enter n to generate random numbers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(1000000);
            int j = i - 1;
            while (j >= 0) {
                if (arr[i] == arr[j]) {
                    i--;
                    j = -1;
                }
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Random and Unique Generated coupon numbers are : ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}

