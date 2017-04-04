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
public class Palantir 
{
    String[] findInsiderTrader(String[] datafeed)
    {
        TreeMap<String, String> result = new TreeMap<String, String>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        String currentPrice = "";
        String currentPriceDay = "";
        String traderName = "";
        String tradeType = "";
        String amount = "";
        boolean fraud = false;
        for(String feed : datafeed)
        {
            String[] singleFeed = feed.split("\\|");
            currentPriceDay = singleFeed[0];
            if(singleFeed.length == 2)
            {
                currentPrice = singleFeed[1];
                for(int i = Integer.parseInt(currentPriceDay)-3; i <= Integer.parseInt(currentPriceDay); i++)
                {
                    if(map.containsKey(Integer.toString(i)))
                    {
                        for(int j = 0; j < map.get(Integer.toString(i)).size();j++)
                        {
                            if(result.containsKey(map.get(Integer.toString(i)).get(0)))
                            {
                                continue;
                            }
                            if(map.get(Integer.toString(i)).get(1).equalsIgnoreCase("BUY"))
                            {
                                fraud = (Integer.parseInt(currentPrice) - Integer.parseInt(map.get(Integer.toString(i)).get(2)))
                                        *Integer.parseInt(map.get(Integer.toString(i)).get(3)) >= 500000;
                            }
                            else
                            {
                                fraud = (Integer.parseInt(map.get(Integer.toString(i)).get(2)) - Integer.parseInt(currentPrice))
                                        *Integer.parseInt(map.get(Integer.toString(i)).get(3)) >= 500000;                                
                            }
                            if(fraud)
                            {
                                result.put(map.get(Integer.toString(i)).get(0), Integer.toString(i));
                            }
                        }
                    }
                }
            }
            else
            {
                traderName = singleFeed[1];
                tradeType = singleFeed[2];
                amount = singleFeed[3];
                if(!map.containsKey(traderName))
                {
                    ArrayList<String> inner = new ArrayList<String>();
                    inner.add(traderName);
                    inner.add(tradeType);
                    inner.add(currentPrice);
                    inner.add(amount);
                    map.put(currentPriceDay, inner);
                }
                
            }
        }
        String[] res = new String[result.size()];
        int index = 0;
        Iterator it = result.entrySet().iterator();
        while (it.hasNext()) 
        {
            Map.Entry pair = (Map.Entry)it.next();
            res[index] = pair.getValue() + "|" + pair.getKey();  
            index++;
        }
        Arrays.sort(res);
        return res;
    }
}
