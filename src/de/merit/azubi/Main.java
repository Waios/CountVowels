package de.merit.azubi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Bitte ein Wort eingeben:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //System.out.println(input);
        int voka = 0;
        int voke = 0;
        int voki = 0;
        int voko = 0;
        int voku = 0;
        int konsonant = 0;
        int umlaut = 0;

        String lowInput= input.toLowerCase();

        for (int x = 0; x < lowInput.length(); x++) {


            char aChar = lowInput.charAt(x);

            //System.out.println(aChar);
            switch (aChar) {
                case 'a':
                    voka++;
                    System.out.println("a");
                    break;

                case 'e':
                    voke++;
                    System.out.println("e");
                    break;

                case 'i':
                    voki++;
                    System.out.println("i");
                    break;

                case 'o':
                    voko++;
                    System.out.println("o");
                    break;

                case 'u':
                    voku++;
                    System.out.println("u");
                    break;

                case 'ä':
                case'ö':
                case 'ü':
                    umlaut++;
                    break;


                default:
                    konsonant++;
            }

        }
        System.out.println("Anzahl a: " + voka);
        System.out.println("Anzahl e: " + voke);
        System.out.println("Anzahl i: " + voki);
        System.out.println("Anzahl o: " + voko);
        System.out.println("Anzahl u: " + voku);
        System.out.println("Anzahl Konsonanten: " + konsonant);
        System.out.println("Anzahl Umlaute: "+umlaut);
    }
}
