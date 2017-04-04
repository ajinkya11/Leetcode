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
public class ThirdMaximumNumber 
{
    public int thirdMax(int nums[])
    {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > first)
            {
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] == first)
            {
                continue;
            }
            else if(nums[i] > second)
            {
                third = second;
                second = nums[i];
            }
            else if(nums[i] == second)
            {
                continue;
            }
            else if(nums[i] > third)
            {
                third = nums[i];
            }
            else if(nums[i] == third)
            {
                continue;
            }
        }
        return third == Long.MIN_VALUE ? (int)first: (int)third;
    }
}
