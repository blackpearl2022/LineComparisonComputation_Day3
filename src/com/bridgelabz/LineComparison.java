package com.bridgelabz;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of First Line");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double firstLineLength = getLen(x1, y1, x2, y2);
        System.out.println("Length of the given Line is : " + firstLineLength + " units");

        System.out.println("Enter the Co-ordinates of Second Line");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        double secondLineLength = getLen(x3, y3, x4, y4);
        System.out.println("Length of the given Line is : " + secondLineLength + " units");
        Boolean isEqual = isEquals(firstLineLength, secondLineLength);
        System.out.println("Lengths are equal:" + isEqual);
    }

    private static Boolean isEquals(double firstLineLength, double secondLineLength) {
        if (firstLineLength == secondLineLength) {
            return true;
        } else {
            return false;
        }
    }

    private static double getLen(int x1, int y1, int x2, int y2) {
        return sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
    }
}