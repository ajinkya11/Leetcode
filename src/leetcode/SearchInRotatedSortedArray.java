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
public class SearchInRotatedSortedArray 
{
    public int search(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] <= nums[high])
            {
                if(target > nums[mid] && target <= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            else
            {
                if(target < nums[mid] && target >= nums[low])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
        }
        return -1;
    
    }
}
