package sda.Prezentacja6;
//Cwiczenie1

public class Zwierze {

    protected String imie;
    protected int wiek;
    public Osoba wlasciciel;

    public Zwierze() {
    }
    public Zwierze(String imie, int wiek) {
        this.imie =imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String name) {
        this.imie = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Osoba getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(Osoba wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public void drukuj (){
        System.out.println(wlasciciel.getImie());
    }
}





