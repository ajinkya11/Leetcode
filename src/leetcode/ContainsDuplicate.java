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
public class ContainsDuplicate 
{
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
