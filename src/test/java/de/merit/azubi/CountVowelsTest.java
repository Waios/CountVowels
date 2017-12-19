package de.merit.azubi;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

// https://homepages.thm.de/~hg11260/mat/junit.pdf

    public class CountVowelsTest {

        @Test
        public void  sortedSetExampleTest() {

            Set<String> s = new TreeSet<String>();

            s.add("Bär");
            s.add("Chimäre");
            s.add("Aal");


            Iterator<String> iter = s.iterator();
            assertEquals("Aal", iter.next());
            assertEquals("Bär", iter.next());
            assertEquals("Chimäre", iter.next());
        }


        @Test
        public void  countVowelsTest() {

            // given

            String testString = "Auto";

            //when
            VowelsCounter theCounter = new VowelsCounter();

            ArrayList<BuchstabeAnzahl> result =theCounter.analyze(testString);


            //then
            for (BuchstabeAnzahl currentBuchstabeAnzahl : result) {
                if (currentBuchstabeAnzahl.getBuchstabe().equals("a")){
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 1);
                }
            }
        }

        @Test
        public void  countMoreVowelsTest() {

            // given

            String testString = "Bogger";

            //when
            VowelsCounter theCounter = new VowelsCounter();

            ArrayList<BuchstabeAnzahl> result =theCounter.analyze(testString);


            //then

            for (BuchstabeAnzahl currentBuchstabeAnzahl : result) {
                if (currentBuchstabeAnzahl.getBuchstabe().equals("a")){
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 0);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("e")){
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 1);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("Konsonant")){
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 4);
                }
            }



        }

        @Test
        public void  countUmlauteVowelsTest() {

            // given

            String testString = "Hühnchen";

            //when
            VowelsCounter theCounter = new VowelsCounter();

            ArrayList<BuchstabeAnzahl> result =theCounter.analyze(testString);


            //then

            for (BuchstabeAnzahl currentBuchstabeAnzahl : result) {
                if (currentBuchstabeAnzahl.getBuchstabe().equals("Umlaut")){
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 1);
                }
            }

        }

        @Test
        public void countSzVowelsTest() {

            // given

            String testString = "Kuß";

            //when
            VowelsCounter theCounter = new VowelsCounter();

            ArrayList<BuchstabeAnzahl> result = theCounter.analyze(testString);


            //then

            for (BuchstabeAnzahl currentBuchstabeAnzahl : result) {
                if (currentBuchstabeAnzahl.getBuchstabe().equals("sz")) {
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 1);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("u")) {
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 1);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("Konsonant")) {
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 1);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("a")) {
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 0);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("e")) {
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 0);
                }
                if (currentBuchstabeAnzahl.getBuchstabe().equals("i")){
                    assertEquals(currentBuchstabeAnzahl.getAnz(), 0);
                }
            }

        }
    }


