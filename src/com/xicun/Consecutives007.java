package com.xicun;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by xicunhan on 29/01/2017.
 */
public class Consecutives007 {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        // your code
        ArrayList<Integer> res = new ArrayList<Integer>();

        int compare = s.get(0);
        int sum = s.get(0);
        for (int i=1; i<s.size();i++){
            int ii = s.get(i);
            if (ii==compare){
                sum+=compare;
            } else {
                compare = ii;
                res.add(sum);
                sum = ii;
            }
        }
        res.add(sum);
        return res;
    }

    public static List<Integer> sumConse(List<Integer> s){
        int previous = Integer.MAX_VALUE;
        LinkedList<Integer> l = new LinkedList<>();
        for (Integer v:s){
            l.add(v==previous? l.pollLast()+v:v);
            previous=v;
        }
        return l;
    }

    public static void main(String args[]){

    }
}
