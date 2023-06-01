package org.lessons.java;
import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int primoNumero = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int secondoNumero = input.nextInt();

        if (primoNumero > secondoNumero) {
            System.out.println("Il numero maggiore è: " + primoNumero);
        } else if (primoNumero < secondoNumero) {
            System.out.println("Il numero maggiore è: " + secondoNumero);
        } else {
            System.out.println("I numeri sono uguali.");
        }
    }
}
