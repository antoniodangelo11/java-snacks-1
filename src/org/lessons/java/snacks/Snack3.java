package org.lessons.java.snacks;

import java.util.Scanner;

/*Snack3
Il software deve chiedere per 10 volte all’utente di inserire un numero. Il programma stampa la somma di tutti i numeri inseriti.
*/
public class Snack3 {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Definisco la variabile
        int sum = 0;

        // Chiedo 10 numeri all'utente
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            int number = input.nextInt();
            sum += number;
        }

        // Stampo la somma dei numeri inseriti
        System.out.println("La somma di tutti i numeri inseriti è: " + sum);

        // Chiudo lo Scanner
        input.close();
    }
}
