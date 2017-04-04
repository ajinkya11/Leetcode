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
public class MajorityElement2 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        
        Set set = map.entrySet();
        Iterator i = set.iterator();
        int count = 0;
        count = (int)Math.floor(nums.length/3);
        while(i.hasNext()) 
        {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
            if((int)me.getValue() > count)
            {
                list.add((int)me.getKey());
            }
        }

        
        
        return list;
    }
}