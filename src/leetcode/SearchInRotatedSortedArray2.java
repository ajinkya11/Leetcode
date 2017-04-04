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
public class SearchInRotatedSortedArray2 
{
        public boolean search(int[] nums, int target) 
        {
            int low = 0;
            int high = nums.length-1;
            
            while(low <= high)
            {
                int mid = (low + high)/2;
                if(nums[mid] == target)
                {
                    return true;
                }
                if(nums[low] < nums[mid])
                {
//                    this part is sorted
                    if(nums[low] <= target && nums[mid] > target)
                    {
                        high = mid-1;
                    }
                    else
                    {
                        low = mid+1;
                    }
                }
                else if(nums[low] > nums[mid])
                {
//                    this part is sorted
                    if(nums[mid] < target && nums[high] >= target)
                    {
                        low = mid+1;
                    }
                    else
                    {
                        high = mid-1;
                    }                    
                }
                else
                {
                    low++;
                }
            }
            return false;
        }
}
