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
public class SummaryRanges 
{
    public List<String> summaryRanges(int[] nums)
    {
        int low = 0;
        int high = 0;
        List<String> arr = new ArrayList<String>();
        
        while(high < nums.length)
        {
            if((nums[high] - nums[low]) == (high - low))
            {
                high++;
            }
            else if(low != high-1)
            {
                String inner = nums[low] + "->" + nums[high-1];
                arr.add(inner);
                low = high;
                high++;
            }
            else
            {
                arr.add(Integer.toString(nums[low]));
                low = high;
                high++;
            }
        }
        if(low == nums.length-1)
        {
            arr.add(Integer.toString(nums[low]));
        }
        else
        {
            String inner = nums[low] + "->" + nums[high-1];
            arr.add(inner);
            }
        
        return arr;
    }
}
