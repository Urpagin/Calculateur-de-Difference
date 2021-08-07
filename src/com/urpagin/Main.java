package com.urpagin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int amountPaid = 0;
        int purchases = 0;
        int bill20, bill10, bill5, coin2, coin1;

        purchases();

        if(amountPaid < purchases)
            System.out.printf("Montant insuffisant!");

        if (amountPaid == purchases) {
            System.out.println("Rien a rendre, fin");
            end();
        }

        int remainder = amountPaid - purchases;
        System.out.println(remainder);


            end();
        }

        public static void purchases() {
            Scanner scan = new Scanner(System.in);
            // Montants de l'achat et donné
            System.out.printf("Montant de l'achat : ");
            scan.next();
            System.out.printf("Montant donné : ");
            scan.next();
        }

        public static void end() {}

    }



