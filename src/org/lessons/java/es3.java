package org.lessons.java;
import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = input.nextInt();
            somma += numero;
        }

        System.out.println("La somma dei numeri inseriti è: " + somma);
    }
}
