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
public class FindMinimumInRotatedSortedArray 
{
    public int findMinimum(int[] nums)
    {
        int low = 0;
        int high = nums.length-1;
        
        while(low<high)
        {
            int mid = (low+high)/2;
            if(nums[low]<nums[mid])
            {
                low = mid;
            }
            else
            {
                high = mid;
            }
        }
        return nums[high+1];
    }
}
