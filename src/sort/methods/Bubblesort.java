/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Bubblesort {
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort.html */
    //private static int[] tablica;
 
/*    public static void main(String[] args) throws java.io.IOException
    {

        sort(tablica); // sortuj

        // wyswietl posortowae liczby
        System.out.println("Posortowane liczby:");
        for (int liczba:tablica)
        System.out.print(liczba+" ");
    }*/

    public static void sort(double[] tablica)
    {
        int mniejszaLiczba = tablica.length-1; // indeks pierwszej porownywanej liczby; wartosc poczatkowa
        int wiekszaLiczba = mniejszaLiczba-1; // indeks drugiej porownywanej liczby; wartosc poczatkowa

        double tmp;
        while (wiekszaLiczba >= 0) // indeks drugiej porownywanej liczby musi byc nieujemny
        {
        if (tablica[wiekszaLiczba] > tablica[mniejszaLiczba]) // jesli druga liczba jest wieksza niz pierwsza
        {
        tmp = tablica[wiekszaLiczba];
        tablica[wiekszaLiczba] = tablica[mniejszaLiczba]; // zamien wartosci
        tablica[mniejszaLiczba] = tmp;

        mniejszaLiczba = tablica.length-1;  // zresetuj licznik
        wiekszaLiczba = mniejszaLiczba-1;   // zresetuj licznik
        }
        else // jesli druga liczba jest mniejsza lub rowna pierwszej, zmniejsz licznik o 1
        {
            mniejszaLiczba--;
            wiekszaLiczba--;
        }
        }
    }
}
