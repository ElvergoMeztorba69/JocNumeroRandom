package exerciciwhilenumrandom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegirScanner = new Scanner (System.in);

        int numrandom = (int) (Math.random() * 11);
        int numrandom2 = (int) (Math.random() * 101);
        int numero;


        do { 
            System.out.println("Escriu un numero del 1 al 10");
            numero = llegirScanner.nextInt();

            if (numero == numrandom) {
                System.out.println("LOCOWIN LOCOWIN LOCOWIN LOCOWIN LOCOWIN LOCOWIN");
            } else {
                System.out.println("Tens un altre oportunitat. Si la aprofites et regalem un premi.");
            }

        } while (numero != numrandom);

        System.out.println("Felisidade mi loco, te ganaste este par de ñemita.");

        System.out.println("NIVEL DO");

        do { 
            System.out.println("Escriu un numero del 1 al 100");
            numero = llegirScanner.nextInt();

            if (numero == numrandom2) {
                System.out.println("LOCOWIN LOCOWIN LOCOWIN LOCOWIN LOCOWIN LOCOWIN");
            } else {
                System.out.println("Tens un altre oportunitat");
            }

        } while (numero != numrandom2);

        llegirScanner.close();
    }
}