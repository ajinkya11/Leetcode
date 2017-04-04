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
public class ContainerWithMostWater 
{
    public int maxArea(int[] nums)
    {
        int left = 0;
        int max = 0;
        int right = nums.length - 1;
        
        while(left < right)
        {
            max = Math.max((right-left)*Math.min(nums[left], nums[right]), max);
            if(nums[left] < nums[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        
        return max;
    }
}
