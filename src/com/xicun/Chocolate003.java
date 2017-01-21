package com.xicun;

/**
 * Created by xicunhan on 21/01/2017.
 */
public class Chocolate003 {
    public static int breakChocolate(int n, int m) {
        if (n<1 || m<1){
            return 0;
        }else if (n==1 && m==1){
            return 0;
        } else{
            return m*n-1;
        }
    }


    public static int breakChocolateSolution(int n, int m){
        //best practice:
        return Math.max(n*m-1,0);
    }
}
