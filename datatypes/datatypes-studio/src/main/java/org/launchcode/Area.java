package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius = scanner.nextDouble();  // Using Double instead of primitive double for consistency

        Double area = Circle.getArea(radius);

        System.out.printf("The area of a circle of radius %.2f is: %.3f%n", radius, area);
    }
}
