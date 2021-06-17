/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.*;
import sort.strategy.Stopwatch;
import mystrategy.Choice;
import java.util.Arrays;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        //double[] dataNonSort = DataGenerator.generate(100000);
        double[] dataNonSort = DataGenerator.generate(10000);
        System.out.println(Arrays.toString(dataNonSort));
        Choice sorting = new Choice();
       /* Wzorzec Stratega */
        //...
        //Strategy strategy = new Bubblesort();
        //Strategy strategy = new Insertionsort();
        Strategy strategy = new Quicksort();
        //Stopwatch watch = new Stopwatch();
        sorting.setStrategy(strategy, dataNonSort, 1); //1 - with time, 0 - without time
        //double tim = watch.elapsedTime();
        //System.out.println("Time: " + tim);
        System.out.println(Arrays.toString(dataNonSort));
    }
}
 //Odpowiedzi na pytania
//1. Proszę o podanie głównego celu zastosowania wzorca strategii.
//Wzorzec strategii wykorzystuje się w momencie, gdy istnieje potrzeba rozwiązania danego problemu na kilka różnych sposobów.
//Zakłada przekształcenie zestawu zachowań w obiekty, które można stosować zamiennie w pierwotnym obiekcie.

//2.  Czy istnieje możliwość zmiany algorytmu w czasie działania programu?
// Strategia umożliwia wymienne stosowanie każdego z algorytmów w trakcie działania aplikacji niezależnie od korzystających z nich użytkowników.

//3. W jaki sposób wzorzec enkapsuluje poszczególne algorytmy?
//Poszczególne algorytmy tworzone są w oddzielnych klasach dziedziczących po klasie abstrakcyjnej. 
//Ta klasa abstrakcyjna wykorzystywana jest poprzez wstrzykiwanie zależno