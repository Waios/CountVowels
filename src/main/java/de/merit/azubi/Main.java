package de.merit.azubi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Bitte ein Wort eingeben:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        VowelsCounter theVowelsCounter = new VowelsCounter();

        int[] result = theVowelsCounter.analyze(input);

        System.out.println("Anzahl a: " + result[0]);
        System.out.println("Anzahl e: " + result[1]);
        System.out.println("Anzahl i: " + result[2]);
        System.out.println("Anzahl o: " + result[3]);
        System.out.println("Anzahl u: " + result[4]);
        System.out.println("Anzahl Konsonanten: " + result[5]);
        System.out.println("Anzahl Umlaute: "+result[6]);

    }
}
