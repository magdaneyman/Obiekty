package sda.Prezentacja6;
import org.w3c.dom.ls.LSOutput;
import sda.Prezentacja6.Zwierze.*;
import sda.Prezentacja6.Osoba.*;
import sda.Prezentacja6.Rectangle.*;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
       /* Pracownik m = new Pracownik("Marek");
        m.wydruk();

        Pracownik n = new Pracownik("Maciej ", "Nowak");
        n.wydruk();

        Pracownik j = new Pracownik("Jaroslaw", "Kowalski");
        j.wydruk();

        j.setImie("Maria");
        j.wydruk();
        j.getImie();
        j.wydruk();
        n.wydrukWszystkichPol();*/

        //Punkt2D a = new Punkt2D(2, 3);
        //double wynik = a.distanceBetweenPoints(1,1);
        // System.out.println(wynik);



        Kot salomon = new Kot();
        Kot maks = new Kot();
        Pies burek = new Pies();
        Pies azor = new Pies();
        Osoba maria = new Osoba();
        maria.setImie("Maria");

        salomon.setWlasciciel(maria);
        maks.setWlasciciel(maria);
        burek.setWlasciciel(maria);
        azor.setWlasciciel(maria);

        salomon.drukuj();
        maks.drukuj();
        burek.drukuj();
        azor.drukuj();


        Rectangle rec1 =new Rectangle(0,0,1,2);

        Rectangle rec2 = new Rectangle(0,0,5,5);

        rec1.rectangleField();
        rec2.rectangleCircumference();
        Rectangle rec4 =rec1.kopiuj();
        rec4.rectangleField();

        MyNumber mn1 = new MyNumber(2);
        MyNumber mn2 = new MyNumber(3);
        MyNumber mn3 =   mn1.add(mn2);
        System.out.println(mn3.getNumber());

        Date date = new Date();
        System.out.println(date.toString());

        String[] tags = {"#zostanW Domu","bedzieDobrze","nieMaJakWDomu"};
        Note note1 = new Note();
        Note note2 = new Note(tags,date,"Pamietaj o piciu wody");

      boolean b = note2.match("#");
        System.out.println(b);



    }




}






