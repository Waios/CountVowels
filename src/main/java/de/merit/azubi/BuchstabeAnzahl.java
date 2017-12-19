package de.merit.azubi;

public class BuchstabeAnzahl {

    private String buchstabe;
    private int anz;

    //Konstruktor
    public BuchstabeAnzahl(String buchstabe) {
        this.buchstabe = buchstabe;
        this.anz = 0;
    }


    public String getBuchstabe() {
        return buchstabe;
    }

    public int getAnz() {
        return anz;
    }

    public void incAnz() {
        anz++;
    }
}
