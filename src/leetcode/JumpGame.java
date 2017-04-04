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
public class JumpGame 
{
    public boolean canJump(int[] nums)
    {
        int countZeroes = 0;
        for(int i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] != 0)
            {
                if(nums[i] > countZeroes)
                {
                    countZeroes = 0;
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                countZeroes++;
            }
        }
        if(countZeroes > 0)
        {
            return false;
        }
        return true;
    } 
}
