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
public class ProductOfArrayExceptSelf 
{
    public int[] productExceptSelf(int[] nums)
    {
        int[] result = new int[nums.length];
        result[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i--)
        {
            result[i] = result[i+1] * nums[i+1];
        }
        int forward = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            result[i] = result[i]*forward;
            forward = forward*nums[i];
        }
        
        return result;
    }
}
