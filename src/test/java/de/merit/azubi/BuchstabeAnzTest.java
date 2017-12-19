package de.merit.azubi;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;


public class BuchstabeAnzTest {

    @Test
    public void  simpleTest() {

        //given
        String in = "a";
        // when

        BuchstabeAnzahl theBuchstabeAnz = new BuchstabeAnzahl(in);

        //then
        assertEquals(theBuchstabeAnz.getBuchstabe(), in); //a
        assertEquals(theBuchstabeAnz.getAnz(), 0);

    }



}


