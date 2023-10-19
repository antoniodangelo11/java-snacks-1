package org.lessons.java.snacks;

import java.util.Random;

/*Snack6
Genera un array di 10 numeri casuali e crea una stringa che lo rappresenta nella forma [valore1, valore2, …, valoreN] senza usare il metodo Arrays.toString()
*/
public class Snack6 {
    public static void main(String[] args) {

        // Genero l'array dei numeri casuali
        int[] randomNumbers = new int[10];
        Random rand = new Random();

        // Genero numeri casuali compresi tra 0 e 99.
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }

        // Definisco la stringa
        String numbersString = "[";

        for (int i = 0; i < randomNumbers.length; i++) {
            numbersString += randomNumbers[i];
            if (i < randomNumbers.length - 1) {
                numbersString += ", ";
            }
        }

        numbersString += "]";

        System.out.println(numbersString);
    }
}
