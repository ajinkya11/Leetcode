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
public class LengthOfLongestSubstring 
{
    public int lengthOfLongestSubstring(String str)
    {
        HashSet<Character> set = new HashSet<Character>();
        int result = 0;
        int index = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(!set.contains(str.charAt(i)))
            {
                set.add(str.charAt(i));
            }
            else
            {
                result = Math.max(result, set.size());
                while(index < i && str.charAt(index) != str.charAt(i))
                {
                    set.remove(str.charAt(index));
                    index++;
                }
                index++;
            }
        }
        
        result = Math.max(result, set.size());
        return result;
    }
}
