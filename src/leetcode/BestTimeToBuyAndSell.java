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
public class BestTimeToBuyAndSell 
{
    public int maxProfit(int nums[])
    {
        int profit = 0;
        int min = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            profit = Math.max(profit, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        
        return profit;
    }
}
