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
public class MinimumSizeSubArraySum 
{
    public int minimumSizeSubArraySum(int nums[], int target)
    {
        int sum = 0;
        int[] back = new int[nums.length];
        for(int window = 1; window <= nums.length; window++)
        {
            for(int start = 0; start < nums.length - window+1; start++)
            {
                if(window == 1)
                {
                    back[start] = nums[start];
                    sum = nums[start];
                }
                else
                {
                    sum = back[start] + nums[start+window-1];
                    back[start] = sum;
                }
                if(sum >= target)
                {
                    return window;
                }
            }
        }
        return 0;
    }
}
