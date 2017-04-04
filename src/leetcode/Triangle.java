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
public class Triangle 
{
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int[] result = new int[triangle.size()];
        for(int i = 0; i < result.length;i++)
        {
            result[i] = triangle.get(triangle.size()-1).get(i);
        }
        for(int i = triangle.size()-2; i >=0; i--)
        {
            for(int j = 0; j < triangle.get(i).size(); j++)
            {
                result[j] = triangle.get(i).get(j) + Math.min(result[j], result[j+1]);
            }
        }
        return result[0];
    }
}
