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
public class UniquePaths2 
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] result = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 && j != 0 && obstacleGrid[i][j] == 0)
                {
                    result[i][j] = result[i][j-1];
                }
                else if(i != 0 && j == 0  && obstacleGrid[i][j] == 0)
                {
                    result[i][j] = result[i-1][j];
                }
                else if(i != 0 && j != 0  && obstacleGrid[i][j] == 0)
                {
                    result[i][j] = result[i-1][j]+result[i][j-1];
                }
                else if(i == 0 && j == 0 && obstacleGrid[i][j] == 0)
                {
                    result[i][j] = 1;
                }
                else
                {
                    result[i][j] = 0;
                }
            }
        }
        return result[m-1][n-1];
    }
}
