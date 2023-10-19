package org.lessons.java.snacks;

import java.util.Scanner;

/* Snack2
L’utente inserisce due parole in successione. Il software stampa prima la parola più corta, poi la parola più lunga.
*/
public class Snack2 {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Chiedo le due parole all'utente
        System.out.print("Inserisci la prima parola: ");
        String firstWord = input.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        String secondWord = input.nextLine();

        // Condizioni in qui faccio stampare prima la parola più corta è poi quella più lunga
        if (firstWord.length() < secondWord.length()) {
            System.out.println("La parola più corta è: " + firstWord);
            System.out.println("La parola più lunga è: " + secondWord);
        } else if (secondWord.length() < firstWord.length()) {
            System.out.println("La parola più corta è: " + secondWord);
            System.out.println("La parola più lunga è: " + firstWord);
        } else {
            System.out.println("Le due parole hanno la stessa lunghezza.");
        }

        // Chiudo lo Scanner
        input.close();
    }
}
