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
public class LongestCommonPrefix 
{
    public String longestCommonPrefix(String[] strs)
    {
        String result = "";
        int minLen = Integer.MAX_VALUE;
        for(String str : strs)
        {
            if(str.length() < minLen)
            {
                result = str;
                minLen = str.length();
            }
        }
        for(String str: strs)
        {
            while(minLen > 0)
            {
                if(!str.startsWith(result))
                {
                    result = result.substring(0,minLen-1);
                    minLen--;
                }
                else
                {
                    break;
                }
            }
        }
        return result;
    }
}
