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
public class TwoSum2 
{
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
