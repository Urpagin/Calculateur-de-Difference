package com.urpagin;

import java.util.Scanner;

public class Main {
    // FIELDS
    private static int amountPaid;
    private static int purchaseAmount = 0;
    private static int bill20, bill10, bill5, coin2, coin1;
    private static int remainder;


    public static void main(String[] args) {
        userInput(); // User Input

        if (amountPaid == purchaseAmount) {
            System.out.println("Rien a rendre, termination du programme");
            end();
        }

        if (purchaseAmount > amountPaid) {
            System.out.println("Solde insuffisant! Termination du programme");
            end();
        }

        billAndCoinCalculation(); // Calcul les billets et pièces
        printing(); // Print les billets et pièces
        end(); // Termination du programme
    }

    public static int userInput() {
        Scanner scan = new Scanner(System.in); // Scannner object init
        // (input) Montant de l'achat et montant donné stockés dans des variables
        boolean error1 = false;
        boolean error2 = false;

        do { // 1st DO WHILE
            error1 = false;
            try {
                System.out.print("Montant de l'achat : ");
                purchaseAmount = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Veuillez entrez un nombre.");
                error1 = true;
                scan.nextLine();

            }

        } while (error1);


        do { // 2nd DO WHILE
            error2 = false;
            try {
                System.out.print("Montant donné : ");
                amountPaid = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Veuillez entrez un nombre.");
                error2 = true;
                scan.nextLine();
            }

        } while (error2);

        return remainder = amountPaid - purchaseAmount;
    }

    public static void billAndCoinCalculation() {
        bill20 = remainder / 20;
        remainder %= 20;
        bill10 = remainder / 10;
        remainder %= 10;
        bill5 = remainder / 5;
        remainder %= 5;

        coin2 = remainder / 2;
        remainder %= 2;
        coin1 = remainder;
        remainder %= 1;
    }

    public static void printing() {
        if (bill20 > 0)
            System.out.printf("billet de 20€ : %d%n", bill20);
        if (bill10 > 0)
            System.out.printf("billet de 10€ : %d%n", bill10);
        if (bill5 > 0)
            System.out.printf("billet de 5€ : %d%n", bill5);
        if (coin2 > 0)
            System.out.printf("pièce de 2€ : %d%n", coin2);
        if (coin1 > 0)
            System.out.printf("pièce de 1€ : %d%n", coin1);
    }

    public static void end() {
        System.out.println();
        System.exit(0);

    }
}



