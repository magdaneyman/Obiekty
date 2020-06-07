package sda.Prezentacja6;

//Cwiczenie 1
public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int wiek;
    protected boolean pracuje;

    public Osoba(String imie, String nazwisko, int wiek, boolean pracuje) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pracuje = pracuje;
    }

    public Osoba() {

    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isPracuje() {
         return pracuje;
    }

    public void setPracuje(boolean pracuje) {
        this.pracuje = pracuje;
    }


}
