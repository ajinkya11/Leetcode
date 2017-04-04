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
public class MajorityElement 
{
    public int majorityElement(int[] nums)
    {
        int element = 0;
        int score = 0;
        for(int num : nums)
        {
            if(score == 0)
            {
                element = num;
                score = 1;
            }
            else if(num == element)
            {
                score++;
            }
            else
            {
                score--;
            }
        }
        return element;
    }
}
