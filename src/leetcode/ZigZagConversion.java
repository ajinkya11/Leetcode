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
public class ZigZagConversion 
{
    public String convert(String str, int numRows)
    {
        if(str.length() == 0){return "";}
        if(numRows == 1){return str;}
        if(numRows == 0){return str;}
        if(str.length() == 1 || str.length() == 2){return str;}
        int count = str.length();
        int swap = 0;
        int jump = 2*numRows - 2;
        int len = count;
        int totalSum = jump;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        StringBuffer sb = new StringBuffer();
        int index = 0;
        while(index < len)
        {
            arr.add(index);
            sb.append(str.charAt(index));
            index += jump;
            count--; 
        }
        swap = 2;
        jump = totalSum - swap;
        while(count > 0)
        {
            index = 0;
            while(index < len)
            {
                if(!arr.contains(index))
                {
                    arr.add(index);
                    sb.append(str.charAt(index));
                    index += jump;
                    jump = totalSum - jump;
                    count--;
                }
                else
                {
                    index++;
                }
            }
            swap += 2;
            jump = totalSum - swap;
        }
        return sb.toString();
    }
}
