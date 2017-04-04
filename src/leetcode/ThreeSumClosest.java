/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.*;

/**
 *
 * @author Ajinkya
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        ArrayList<Integer> minimum = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int high = nums.length - 1;
            int low = i + 1;
            int currentSum = target - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == currentSum) {
                    result = nums[low] + nums[high] + nums[i];
                    return result;
                } else {
                    if (Math.abs(currentSum - nums[low] - nums[high]) < min) {
                        min = Math.abs(currentSum - nums[low] - nums[high]);
                        result = nums[i] + nums[low] + nums[high];
                    }
                    if (nums[low] + nums[high] > currentSum) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return result;
    }
}
