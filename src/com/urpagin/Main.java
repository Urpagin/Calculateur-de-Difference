package com.urpagin;

import java.util.Scanner;

public class Main {

    private static int amountPaid;
    private static int purchaseAmount = 0;
    private static int bill20, bill10, bill5, coin2, coin1;
    private static String one;
    private static String two;

    public static void main(String[] args) {



        purchases();

        if(purchaseAmount > amountPaid) {
            System.out.printf("Montant insuffisant!");
            end();
        }

        if (amountPaid == purchaseAmount) {
            System.out.println("Rien a rendre, fin");
            end();
        }

        int remainder = amountPaid - purchaseAmount;
        System.out.println(remainder);


            end();
        }

        public static void purchases() {
            Scanner scan = new Scanner(System.in);
            // Montants de l'achat et donné
            System.out.printf("Montant de l'achat : ");
            one = scan.next();
            purchaseAmount = Integer.parseInt(one);
            System.out.printf("Montant donné : ");
            two = scan.next();
            amountPaid = Integer.parseInt(two);
        }

        public static void end() {}

    }



