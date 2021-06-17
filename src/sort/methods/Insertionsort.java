/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;
import mystrategy.Strategy;
import sort.strategy.Stopwatch;
/**
 *
 * @author LeopardProMK
 */
public class Insertionsort extends Strategy{
double[] tablica;
@Override
    public double[] sort(double[] tablica, int withTime){
    Stopwatch watch = new Stopwatch();
    double klucz;
    int j;
 
    //dla kazdego elementu tablicy do posortowania, poczawszy od drugiego
    for (int i=1;i<tablica.length;i++){
        j=i;
        klucz=tablica[i];
        //poszukaj miejsca dla aktualnego elementu
        //szukaj tylko w posortowanej juz czescie tablicy
        //(czyli wsrod elementow o indeksach mniejszych od aktualnego)
        //przesuwaj element w kiedunku poczatku tablicy
        //tak dlugo, az przed nim jest element wiekszy i
        //nie znajduje sie na poczatku tablicy
        while (j>0 && tablica[j-1]>klucz){
            tablica[j]=tablica[j-1];
            j--;
        }
        tablica[j]=klucz;
    }
 
    if (withTime==1){
        double tim = watch.elapsedTime();
        System.out.println("Time: " + tim);}
    this.tablica=tablica;
    return tablica;
}
}