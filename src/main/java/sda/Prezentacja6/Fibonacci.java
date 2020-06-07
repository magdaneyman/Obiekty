package sda.Prezentacja6;

public class Fibonacci {
    static int fibonacciSequence(int n) {
        if (n == 0)
            return n;
        if (n==1)
            return n;
        else return (fibonacciSequence(n - 1) + fibonacciSequence(n - 2));

    }

    /*public static boolean ciagArytmetyczny(int[]ciag){
        int j = 0;
        for (int i = 0; i <ciag.length; i++) {
            int wynik = 1 +ciag.length -1;
            if (ciag[i] == 1+wynik)
                return true;

        }

    }*/

    public static void main(String[] args) {
        System.out.println(fibonacciSequence(9));

    }
}

