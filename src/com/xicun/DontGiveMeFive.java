package com.xicun;
import java.lang.String;
import java.util.stream.IntStream;
/**
 * Created by xicunhan on 20/01/2017.
 */
public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end)
    {
        if (start > end){ return 0;}
        int counter = 0;
        for (int i=start; i<=end; i++){
            if (!containsFive(i)){counter++;}
        }
        return counter;
    }

    private static boolean containsFive(int chiffre){
        String b = String.valueOf(chiffre);
        char [] a = b.toCharArray();
        for (int i=0; i< a.length; i++)
            if (a[i] == '5') {
                return true;
            }
        return false;
    }

    public static int dontGiveMeFive2 (int start, int end){
        return (int)IntStream.range(start,end+1).filter(x->!String.valueOf(x).contains("5")).count();
    }
}
