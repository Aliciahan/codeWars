package com.xicun;

/**
 * Created by xicunhan on 24/01/2017.
 */
class RowSumOddNumbers006 {
    public static int rowSumOddNumbers(int n) {
        int res= 0;
        for (int i=1;i<n;i++){
            res-=2*i;
        }
        return (n*(n+1)-1)*n+res;
    }
}

//en faite, si on connait un peu math, le resultat c'est : (int) Math.pow(n,3);