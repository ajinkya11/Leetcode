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
public class MaxConsecutiveOnes 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int maxCount = 0;
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 1)
            {
                if(currentCount > maxCount)
                {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
            else
            {
                currentCount++;
            }
        }
        if(currentCount > maxCount)
        {
            maxCount = currentCount;
        }
        return maxCount;
    }
}
