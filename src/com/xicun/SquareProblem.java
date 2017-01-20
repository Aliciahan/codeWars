package com.xicun;
import java.lang.Math.*;
/**
 * Created by xicunhan on 19/01/2017.
 */
public class SquareProblem {
    public static boolean isSquare(int n ){
        return Math.sqrt(n)%1==0;
    }

    public static boolean isSquare2(int n){
        return Math.sqrt(n)==(int)Math.sqrt(n)? true:false;
    }

    public static boolean isSquare3(int n ){
        int sqn = 0;
        while(sqn*sqn <n){
            sqn++;
        }
        return (sqn*sqn==n);
    }
}
