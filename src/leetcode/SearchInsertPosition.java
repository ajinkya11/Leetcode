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
public class SearchInsertPosition 
{
    public int searchInsert(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length-1;
        if(nums.length == 0) return 0;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(target < nums[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
}
