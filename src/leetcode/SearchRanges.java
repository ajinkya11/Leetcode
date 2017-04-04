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
public class SearchRanges 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int index = Arrays.binarySearch(nums, target);
        int[] res = {-1,-1};
        
        if(index >= 0)
        {
            int i = index;
            while(i < nums.length && nums[i] == target)
            {
                i++;
            }
            res[1] = i-1;
            i = index;
            while(i >= 0 && nums[i] == target)
            {
                i--;
            }
            res[0] = i+1;
        }
        
        return res;
    }
}
