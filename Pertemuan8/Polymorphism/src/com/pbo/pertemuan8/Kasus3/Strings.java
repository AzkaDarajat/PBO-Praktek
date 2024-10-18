package com.pbo.pertemuan8.Kasus3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the number of Strings to be sorted
        System.out.print("How many strings do you want to sort? ");
        int size = scan.nextInt();
        scan.nextLine(); // Consume the leftover newline

        // Create an array of Strings
        String[] strings = new String[size];

        // Read the strings
        System.out.println("Enter the strings...");
        for (int i = 0; i < size; i++) {
            strings[i] = scan.nextLine();
        }

        // Sort the strings
        Sorting.insertionSort(strings);

        // Print the sorted strings
        System.out.println("Your strings in sorted order...");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}




