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
public class LicenseKeyFormatting 
{
    public String licenseKeyFormatting(String s, int K) 
    {
        ArrayList<Character> arr = new ArrayList<Character>();
        s = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != '-')
            {
                arr.add(s.charAt(i));
            }
        }
        if(arr.size() == 0)
        {
            return "";
        }
        Collections.reverse(arr);
        for(int i = arr.size()-1; i >= 0; i--)
        {
            if((i+1)%K == 0)
            {
                sb.append('-');
            }
            sb.append(arr.get(i));
        }
        if(sb.charAt(0) == '-')
        {
            sb.deleteCharAt(0);
        }
        if(sb.charAt(sb.toString().length()-1) == '-')
        {
            sb.deleteCharAt(sb.toString().length()-1);
        }
        System.out.println(sb);
        return sb.toString();
    }

}
