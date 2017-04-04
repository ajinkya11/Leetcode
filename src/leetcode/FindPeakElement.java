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
public class FindPeakElement 
{
    public int findPeakElement(int[] nums)
    {
        int low = 0;
        int high = nums.length-1;
        
        while(low<high)
        {
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;
            
            if(nums[mid1] < nums[mid2])
            {
                low = mid2;
            }
            else
            {
                high = mid1;
            }
        }
        return low;
    }
}
