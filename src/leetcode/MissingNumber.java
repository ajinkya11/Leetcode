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
public class MissingNumber 
{
    public int missingNumber(int[] nums) {
        int totalNum = nums.length;
        int sum = totalNum * (totalNum +1)/2;
        int actualSum = 0;
        for(int i = 0; i < totalNum; i++)
        {
            actualSum = actualSum + nums[i];
        }
        return sum - actualSum;
        
    }
}
