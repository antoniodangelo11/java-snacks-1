package org.lessons.java.snacks;

import java.util.Scanner;

/* Snack1
L’utente inserisce due numeri in successione. Il software stampa il maggiore.
 */
public class Snack1 {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Chiedo i numeri all'utente
        System.out.print("Inserisci il primo numero: ");
        int firstNumber = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.print("Il numero è maggiore: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.print("Il numero è maggiore: " + secondNumber);
        } else {
            System.out.print("I due numeri sono uguali.");
        }

        input.close();
    }
}