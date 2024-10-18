package com.pbo.pertemuan8.Kasus3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the number of integers to be sorted
        System.out.print("How many numbers do you want to sort? ");
        int size = scan.nextInt();

        // Create an array of Integers
        Integer[] numbers = new Integer[size];

        // Read the numbers
        System.out.println("Enter the numbers...");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        // Sort the numbers
        Sorting.selectionSort(numbers);

        // Print the sorted numbers
        System.out.println("Your numbers in sorted order...");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}



