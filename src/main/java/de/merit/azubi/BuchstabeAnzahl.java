package de.merit.azubi;

public class BuchstabeAnzahl {

    private char buchstabe;
    private int anz;

    public BuchstabeAnzahl(char buchstabe) {
        this.buchstabe = buchstabe;
        this.anz = 0;
    }

    public char getBuchstabe() {
        return buchstabe;
    }

    public int getAnz() {
        return anz;
    }
}
