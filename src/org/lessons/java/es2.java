package org.lessons.java;
import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String primaParola = input.next();

        System.out.print("Inserisci la seconda parola: ");
        String secondaParola = input.next();

        if (primaParola.length() < secondaParola.length()) {
            System.out.println("La parola più corta è: " + primaParola);
            System.out.println("La parola più lunga è: " + secondaParola);
        } else if (primaParola.length() > secondaParola.length()) {
            System.out.println("La parola più corta è: " + secondaParola);
            System.out.println("La parola più lunga è: " + primaParola);
        } else {
            System.out.println("Le parole hanno la stessa lunghezza.");
        }
    }
}
