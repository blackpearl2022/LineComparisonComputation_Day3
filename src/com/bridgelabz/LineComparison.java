package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double len = getLen(x1, y1, x2, y2);
        System.out.println("Length of the given Line is : " + len + " units");
    }

    private static double getLen(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
    }
}

