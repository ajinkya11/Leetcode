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
public class FindTheDuplicateNumber 
{
    public int findDuplicate(int[] nums) 
    {
        int fast = 0;
        int slow = 0;
        
        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);
        
                int find = 0;
 
        while(find != slow)
        {
            slow = nums[slow];
            find = nums[find];
        }
        return find;

    }    
}
