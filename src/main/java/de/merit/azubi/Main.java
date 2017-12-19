package de.merit.azubi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Bitte ein Wort eingeben:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        VowelsCounter theVowelsCounter = new VowelsCounter();

        ArrayList<BuchstabeAnzahl> result = theVowelsCounter.analyze(input);


        for (BuchstabeAnzahl currentBuchstabeAnzahl : result) {
            System.out.println(currentBuchstabeAnzahl.getBuchstabe()+  " : " +  currentBuchstabeAnzahl.getAnz());
        }



    }
}
