package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter DNA strand to pair (ATCG):");
        String chosen = scanner.nextLine();

        switch (chosen) {
            case "A":
                System.out.println("T");
                break;
            case "T":
                System.out.println("C");
                break;
            case "C":
                System.out.println("G");
                break;
            case "G":
                System.out.println("C");
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
