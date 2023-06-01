package org.lessons.java;
import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {
        String[] invitati = {"Thomas", "Paolo", "Hadolph", "Mohammed", "Sofia"};

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = input.nextLine();

        boolean invitatoPresente = false;

        for (int i = 0; i < invitati.length; i++) {
            if (invitati[i].equals(nomeUtente)) {
                invitatoPresente = true;
                break;
            }
        }

        if (invitatoPresente) {
            System.out.println("Sei invitato alla festa del Grande Gatsby!");
        } else {
            System.out.println("Mi dispiace, non sei invitato alla festa del Grande Gatsby.");
        }
    }
}
