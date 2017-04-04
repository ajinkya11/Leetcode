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
public class FindAllDuplicatesInAnArray 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int val = 0;
            if(nums[i] < 0)
            {
                val = -nums[i]-1;
            }
            else
            {
                val = nums[i] - 1;
            }
            if(nums[val] > 0)
            {
                nums[val] = -nums[val];
            }
            else
            {
                list.add(Math.abs(nums[i]));
            }
        } 
        return list;
    }
}
