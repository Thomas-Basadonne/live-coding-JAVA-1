package org.lessons.java;

import java.util.Scanner;

public class es6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi elevare al cubo?: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int cubo = i * i * i;
            System.out.println("Il cubo di " + i + " è: " + cubo);
        }
    }
}
