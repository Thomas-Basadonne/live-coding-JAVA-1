package org.lessons.java;

import java.util.Scanner;

public class es5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = input.nextInt();

            if (numero % 2 != 0) {
                System.out.println("Il numero inserito è dispari.");
            }else {
                System.out.println("Il numero inserito è pari.");
            }
        }
    }
}
