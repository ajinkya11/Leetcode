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
public class RemoveDuplicatesFromSortedArray 
{
    public int removeDuplicates(int[] nums)
    {
        int i,j;
        for(i = 0, j = 0; j < nums.length;)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
