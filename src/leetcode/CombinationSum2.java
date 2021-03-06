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
public class CombinationSum2 
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0) return result;
 
        ArrayList<Integer> current = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, current, result);
 
        return result;
        
    }
    public void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr, List<List<Integer>> result)
    {
        if(target == 0)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>(curr);
            result.add(temp);
            return;
        }
        int prev = -1;
 
        for(int i=j; i<candidates.length; i++)
        {
            if(target < candidates[i]) 
            return;
            // if(curr.contains(candidates[i])){continue;}
            if(prev != candidates[i])
            {
                curr.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i+1, curr, result);
                curr.remove(curr.size()-1); 
                prev = candidates[i];
            }
        }
    }
}
