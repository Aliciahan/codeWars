package com.xicun;

/**
 * Created by xicunhan on 21/01/2017.
 */
import java.util.ArrayList;

public class AreSame004 {

    public static boolean comp(int[] a, int[] b) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        if (a == null || b==null ){return false;}
        if (a.length!=b.length){return false;}

        for(int j =0; j<b.length; j++){
            i.add(j);
        }

        for(int j =0; j<a.length; j++){
            int tmp = isIn(b,i,a[j]);
            if(tmp!=-1){
                i.remove(tmp);
            }
        }

        if (i.size()==0){
            return true;
        }

        return false;
    }
    static int isIn (int[]b, ArrayList<Integer>i, int a){

        for (int j =0; j<i.size();j++){
            if(b[i.get(j)]==a*a) {
                return j;
            }
        }
        return -1;


    }
}