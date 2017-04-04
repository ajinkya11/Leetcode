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
public class Subsets 
{
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int num: nums)
        {
            List<List<Integer>> tempRes = new ArrayList<List<Integer>>();

            for(List<Integer> t : result)
            {
                tempRes.add(new ArrayList<Integer>(t));
            }
            for(List<Integer> t : tempRes)
            {
                t.add(num);
            }
    		ArrayList<Integer> single = new ArrayList<Integer>();
    		single.add(num);
    		tempRes.add(single);
     
    		result.addAll(tempRes);
        }
        result.add(new ArrayList<Integer>());

        return result;
    }
}
