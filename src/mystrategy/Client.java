/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.*;
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
        double[] dataNonSort = DataGenerator.generate(100);
        System.out.println(Arrays.toString(dataNonSort));
        Choice sorting = new Choice();
       /* Wzorzec Stratega */
        //...
        Strategy strategy = new Bubblesort();
        sorting.setStrategy(strategy, dataNonSort);
        System.out.println(Arrays.toString(dataNonSort));
        System.out.println("Time: ??");
    }
}
