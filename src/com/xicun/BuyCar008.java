//package com.xicun;

import java.util.ArrayList;

/**
 * Created by xicunhan on 05/02/2017.
 */
public class BuyCar008 {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        // your code
        int [] result = {0,0};
        int i =1;
        double plbm = percentLossByMonth/100;
        double all = startPriceOld;
        double po = startPriceOld;
        double pn = startPriceNew;

        if (po>=pn){
            result[0]=0;
            result[1]=(int)(po-pn);
            return result;
        }
        while (i>=1){
            all = savingperMonth*i+po*(1-plbm);
            po = po*(1-plbm);
            System.out.println("the loss rate is: "+plbm);
            System.out.println("the sum of money: "+all);
            System.out.println("the value of the car:"+pn*(1-plbm));
            if (all>=(pn*(1-plbm))){
                result[0]=i;
                result[1]= (int) Math.rint(all-(pn*(1-plbm)));
                return result;
            }
            pn = pn*(1-plbm);
            i++;
            if (i%2==0){
                plbm+=0.005;
            }
        }
        return result;
    }



    public static void main(String [] args){
        System.out.println("the result is:"+nbMonths(2000,8000,1000,1.5)[1]);
    }
}

class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 1;
        int savings = 0;
        double startPriceOldD = (double) startPriceOld;
        double startPriceNewD = (double) startPriceNew;
        while (startPriceNewD > (startPriceOldD + savings)) {
            if (month % 2 == 0)  percentLossByMonth += .5d;
            startPriceOldD *= (1 - percentLossByMonth / 100);
            startPriceNewD *= (1 - percentLossByMonth / 100);
            savings += savingperMonth;
            month++;
        }
        return new int[] { --month,  (int) Math.round((startPriceOldD + savings) - startPriceNewD) };
    }
}

