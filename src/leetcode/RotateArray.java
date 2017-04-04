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
public class RotateArray 
{
    public void rotate(int[] nums, int k)
    {
        k %= nums.length;
        reverse(nums, 0, k);
        reverse(nums, k+1, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    public void reverse(int nums[], int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
