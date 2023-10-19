package org.lessons.java.snacks;

import java.util.Scanner;

/*Snack5
Stampa il cubo dei primi N numeri, dove N è un numero indicato dall’utente.
*/
public class Snack5 {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int N = input.nextInt();

        for (int i = 0; i <= N; i++) {
            int cube = i * i * i;
            System.out.println("Il cubo di " + i + " è " + cube);
        }

        // Chiudo lo Scanner
        input.close();
    }
}
