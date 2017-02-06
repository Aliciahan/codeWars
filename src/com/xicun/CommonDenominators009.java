//package com.xicun;
import java.util.*;

/**
 * Created by xicunhan on 06/02/2017.
 */
public class CommonDenominators009 {
    public static String convertFrac(long[][] lst) {
        long tmp = lst[0][1];
        for (int i=1; i<lst.length;i++){
            tmp = minCommonMultiple(tmp,lst[i][1]);
        }
        String result = "";
        for (long[] list:lst){
            result=result+"("+list[0]*tmp/list[1]+","+tmp+")";
        }

        return result;

    }

    public static void main(String[] args){
        CommonDenominators009 cd09 = new CommonDenominators009();
        long [][] lst = new long[][] { {1, 2}, {1, 3}, {1, 4} };
        System.out.println(cd09.convertFrac(lst));
    }

    // 递归法求最大公约数
    public static long maxCommonDivisor(long m, long n) {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            long temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {// 若余数为0,返回最大公约数
            return n;
        } else { // 否则,进行递归,把n赋给m,把余数赋给n
            return maxCommonDivisor(n, m % n);
        }
    }

    // 循环法求最大公约数
    public static long maxCommonDivisor2(long m, long n) {

        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            long temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {// 在余数不能为0时,进行循环
            long temp = m % n;
            m = n;
            n = temp;
        }
        return n;// 返回最大公约数
    }

    // 求最小公倍数
    public static long minCommonMultiple(long m, long n) {
        return m * n / maxCommonDivisor(m, n);
    }
}
