package com.xicun;

/**
 * Created by xicunhan on 23/01/2017.
 */
import java.lang.String;

public class CountDig005 {

    public static int nbDig(int n, int d) {
        // your code
        int counter=0;

        for (int i=0; i<=n;i++){
            char [] tmp = String.valueOf(i*i).toCharArray();

            for (int j=0; j<tmp.length; j++){
                if(tmp[j]==String.valueOf(d).toCharArray()[0]){
                    counter++;
                }
            }
        }
        return counter;
    }

}

/*
import java.util.stream.IntStream;

public class CountDig {

    public static int nbDig(int n, int d) {

        return (int) IntStream
                .rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char)i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }
}*/
