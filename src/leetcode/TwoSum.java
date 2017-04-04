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
public class TwoSum 
{
    public boolean twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]) && map.get(nums[i]) != i)
            {
                return true;
            }
            else
            {
                map.put(target - nums[i], i);
            }
        }
        
        return false;
    }

    public boolean twoSumSorted(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        
        while(low < high)
        {
            int sum = nums[low] + nums[high];
            if(sum > target)
            {
                high--;
            }
            else if(sum < target)
            {
                low++;
            }
            else
            {
                return true;
            }
        }
        
        return false;
    }

}
