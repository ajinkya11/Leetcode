/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.*;

/**
 *
 * @author Ajinkya
 */
public class LargestRectangleInHistogram 
{
    public int maxArea(int[] nums)
    {
        int area = 0; 
        int max = 0;
        int top = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i;
        for(i = 0; i < nums.length; i++)
        {
            if(stack.isEmpty() || nums[i] > nums[stack.peek()])
            {
                stack.push(i);
            }
            else
            {
                top = stack.pop();
                
                if(stack.isEmpty())
                {
                    area = i * nums[top];
                }
                else
                {
                    area = nums[top] * (i - stack.peek() - 1); 
                }
            }
        }
        if(max < area)
        {
            max = area;
        }
        while(!stack.isEmpty())
        {
            top = stack.pop();
               
            if(stack.isEmpty())
            {
                area = i * nums[top];
            }
            else
            {
                area = nums[top] * (i - stack.peek() - 1); 
            }           
        }
        if(max < area)
        {
            max = area;
        }
        return max;
    }
}
