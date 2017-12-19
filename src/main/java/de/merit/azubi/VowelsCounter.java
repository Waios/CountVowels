package de.merit.azubi;

import java.util.ArrayList;

public class VowelsCounter {


    public ArrayList<BuchstabeAnzahl> analyze(String input) {



        BuchstabeAnzahl voka = new BuchstabeAnzahl("a");
        BuchstabeAnzahl voke = new BuchstabeAnzahl("e");
        BuchstabeAnzahl voki = new BuchstabeAnzahl("i");
        BuchstabeAnzahl voko = new BuchstabeAnzahl("o");
        BuchstabeAnzahl voku = new BuchstabeAnzahl("u");
        BuchstabeAnzahl konsonant = new BuchstabeAnzahl("Konsonant");
        BuchstabeAnzahl umlaut =   new BuchstabeAnzahl("Umlaut");
        BuchstabeAnzahl sz = new BuchstabeAnzahl("sz");

        String lowInput= input.toLowerCase();

        for (int x = 0; x < lowInput.length(); x++) {


            char aChar = lowInput.charAt(x);

            //System.out.println(aChar);
            switch (aChar) {
                case 'a':
                    voka.incAnz();

                    break;

                case 'e':
                    voke.incAnz();

                    break;

                case 'i':
                    voki.incAnz();

                    break;

                case 'o':
                    voko.incAnz();

                    break;

                case 'u':
                    voku.incAnz();

                    break;

                case 'ß':
                    sz.incAnz();

                    break;

                case 'ä':
                case 'ö':
                case 'ü':
                    umlaut.incAnz();
                    break;


                default:
                    konsonant.incAnz();
            }

        }


        ArrayList<BuchstabeAnzahl> resultList = new ArrayList<BuchstabeAnzahl>();
        resultList.add(voka);
        resultList.add(voke);
        resultList.add(voki);
        resultList.add(voko);
        resultList.add(voku);
        resultList.add(konsonant);
        resultList.add(umlaut);
        resultList.add(sz);

        return resultList;
    }
}
