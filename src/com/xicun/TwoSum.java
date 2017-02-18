package com.xicun;

/**
 * Created by xicunhan on 18/02/2017.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] solution = new int [2];

        for (int i =0;i<nums.length-1; i++){
            solution[0]=i;
            for (int j=i+1; j<nums.length;j++){
                if ((target-nums[i])==nums[j]){
                    solution[1]=j;
                    return solution;
                }
            }
        }

        return new int[] {0,0};

    }
}
