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

            int[] result =theCounter.analyze(testString);


            //then
            assertEquals(result[0], 1); //a
            assertEquals(result[1], 0); //e

        }

        @Test
        public void  countMoreVowelsTest() {

            // given

            String testString = "Bogger";

            //when
            VowelsCounter theCounter = new VowelsCounter();

            int[] result =theCounter.analyze(testString);


            //then
            assertEquals(result[0], 0); //a
            assertEquals(result[1], 1); //e
            assertEquals(result[5], 4); //konsonant

        }

        @Test
        public void  countUmlauteVowelsTest() {

            // given

            String testString = "Hühnchen";

            //when
            VowelsCounter theCounter = new VowelsCounter();

            int[] result =theCounter.analyze(testString);


            //then
            assertEquals(result[0], 0); //a
            assertEquals(result[1], 1); //e
            assertEquals(result[5], 6); //konsonant
            assertEquals(result[6], 1); //umlaute

        }
    }


