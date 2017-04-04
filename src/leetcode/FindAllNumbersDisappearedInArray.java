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
public class FindAllNumbersDisappearedInArray 
{
    public List<Integer> findDisappeared(int nums[])
    {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int val = Math.abs(nums[i])-1;
            if(nums[val] > 0)
            {
                nums[val] = -nums[val];
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                arr.add(i+1);
            }
        }
        return arr;
    }
}
