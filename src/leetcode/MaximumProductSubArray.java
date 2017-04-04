/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Ajinkya
 */
public class MaximumProductSubArray 
{
    public int maxProduct(int[] nums) 
    {
        if(nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int[] back = new int[nums.length];
        
        for(int window = 1; window <= nums.length; window++)
        {
            for(int start = 0; start < nums.length - window + 1; start++)
            {
                if(window == 1)
                {
                    back[start] = nums[start];
                }
                else
                {
                    back[start] = back[start] * nums[start + window - 1];
                }
                if(back[start] > max)
                {
                    max = back[start];
                }
            }
        }
        return max;
    }
}
