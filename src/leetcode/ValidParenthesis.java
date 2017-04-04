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
public class ValidParenthesis 
{
    public boolean isValid(String str)
    {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                stack.push(str.charAt(i));
            }
            else if(map.values().contains(str.charAt(i)))
            {
                if(!stack.isEmpty() && map.get(stack.peek())==str.charAt(i))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
