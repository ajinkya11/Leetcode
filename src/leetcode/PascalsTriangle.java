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
public class PascalsTriangle 
{
    public List<List<Integer>> generate(int numRows) 
    {
        ArrayList<Integer> inner = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows < 1)return result;
        inner.add(1);
        result.add(inner);
        inner = new ArrayList<Integer>();
        for(int i = 1; i < numRows; i++)
        {
            inner.add(1);
            // System.out.println(result.get(i-1).size());
            for(int j = 1; j <= result.get(i-1).size()-1; j++)
            {
                inner.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            inner.add(1);
            result.add(inner);
            inner = new ArrayList<Integer>();
        }
        return result;
    }
}
