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
public class PascalsTriangle2 
{
    public List<Integer> getRow(int rowIndex) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        if(rowIndex == 0)return arr;
        arr.add(1);
        for(int i = 1; i < rowIndex; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr);
            arr.clear();
            arr.add(1);
            for(int j = 0; j < temp.size()-1; j++)
            {
                arr.add(temp.get(j)+temp.get(j+1));
            }
            arr.add(1);
        }
        return arr;
    }
}
