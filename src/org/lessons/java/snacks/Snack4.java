package org.lessons.java.snacks;

import java.util.Scanner;

/*Snack4
Chiedi per 6 volte all’utente di inserire un numero, se è dispari mostrare questa informazione a video
*/
public class Snack4 {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Chiedo 6 numeri all'utente
        for (int i = 1; i <= 6 ; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            int number = input.nextInt();

            // Condizione in qui stabilisco se è dispari
            if (number % 2 != 0) {
                System.out.println("Il numero " + number + " è dispari.");
            }
        }

        // Chiudo lo Scanner
        input.close();
    }
}
