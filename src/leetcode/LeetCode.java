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
public class LeetCode 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String[] test= new String[]
        {
           "0|20",
"0|Kristi|SELL|3000",
"0|Will|BUY|5000",
"0|Tom|BUY|50000",
"0|Shilpa|BUY|1500",
"1|Tom|BUY|1500000",
"3|25",
"5|Shilpa|SELL|1500",
"8|Kristi|SELL|600000",
"9|Shilpa|BUY|500",
"10|15",
"11|5",
"14|Will|BUY|100000",
"15|Will|BUY|100000",
"16|Will|BUY|100000",
"17|25"
        
        }; 
        Palantir pr = new Palantir();
        String[] res = pr.findInsiderTrader(test);
        for(String a: res)
        {
            System.out.println(a);
        }
        // TODO code application logic here
    }
    
}
