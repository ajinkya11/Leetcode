package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajinkya
 */
public class LongestPalindromicSubstring 
{
    public String longestPalindromicSubstring(String str)
    {
        int[][] resArr = new int[str.length()][str.length()];
        int[] indices = new int[2];
        int max = 0;
        for(int j = 0; j< str.length()-1; j++)
        {
            for(int i = 0; i<= j; i++)
            {
                if(i == j)
                {
                resArr[i][j] = 1;
                }
                else if(str.charAt(i) == str.charAt(j))
                {
                    resArr[i][j] = 2 + resArr[i+1][j-1];
                    if(resArr[i][j] > max)
                    {
                        max = resArr[i][j];
                        indices[0] = i;
                        indices[1] = j;
                    }
                }
                else
                {
                    resArr[i][j] = 0;
                }
            }
        }
        return str.substring(indices[0], indices[1]+1);
    }
}
