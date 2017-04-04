/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Ajinkya
 */
public class MinimumPathSum 
{
    public int minPathSum(int[][] grid) 
    {
        int[][] temp = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j< grid[0].length; j++)
            {
                if(i == 0 && j != 0)
                {
                    temp[i][j] = grid[i][j] + temp[i][j-1];
                }
                else if(i != 0 && j == 0)
                {
                    temp[i][j] = grid[i][j] + temp[i-1][j];
                }
                else if(i != 0 && j != 0)
                {
                    int min = temp[i][j-1] < temp[i-1][j] ? temp[i][j-1] : temp[i-1][j];
                    temp[i][j] = grid[i][j] + min;
                }
                else
                {
                    temp[i][j] = grid[i][j];
                }
            }
        }
        return temp[grid.length-1][grid[0].length-1];
    }
}
