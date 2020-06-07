package sda.Prezentacja6;

public class Pracownik {

    //Zadanie1

    public String imie;
    public String nazwisko;
    public int wiek;
    public String dataZatrudnienia;
    public int id;

    public Pracownik(String m){
        imie= m;
    }
    public Pracownik(String m,String n){
        imie= m;
        nazwisko = n;
    }
    public Pracownik (String m , String n, int a,String b){
        imie= m;
        nazwisko = n;
        wiek = a;
        dataZatrudnienia=b;

    }
    //getter
    public String getImie(){
        return imie;
    }
    //setter
    public void setImie(String noweImie){
        this.imie = noweImie;

    }
    public void wydruk(){
        System.out.println(imie);
    }
    public void wydrukWszystkichPol(){
        System.out.println(imie+" "+nazwisko+" "+ wiek+ " " + dataZatrudnienia);

    }
}



