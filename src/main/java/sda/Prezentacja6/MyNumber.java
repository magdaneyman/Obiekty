package sda.Prezentacja6;

public class MyNumber {
    private long Number;

    public MyNumber() {

    }

    public MyNumber(long a){
        this.Number= a;

    }

    public long getNumber() {
        return Number;
    }
    public boolean isOdd () {
        if (Number % 2 == 1)
            return true;
        else return false;
    }

    public boolean isEven(){
        if (Number % 2 == 0)
            return true;
        else return false;
    }

    public long abs(){
        return Math.abs(Number);
    }

    public double power(){
        return Math.pow(Number,2);

    }
    public MyNumber add(MyNumber mn){
        long wynik = Number + mn.getNumber();
        MyNumber mn4 = new MyNumber(wynik);
        return mn4;

    }
    public long value(){
        return Number;
    }

}

// w metodach wywolac konstruktor wtedy bedzie zwracac myNumber


