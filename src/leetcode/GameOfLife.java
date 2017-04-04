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
public class GameOfLife 
{
    public void gameOfLife(int[][] board) 
    {
        if(board.length==0)return;
        
        int row = board.length;
        int col = board[0].length;
        
        int[][] temp = new int[row+2][col+2];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
               temp[i+1][j+1] = board[i][j];
            }
        }
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= col; j++)
            {
                int alive = temp[i-1][j-1] + temp[i-1][j] + temp[i-1][j+1] + temp[i][j+1] + temp[i+1][j+1] + temp[i+1][j] + temp[i+1][j-1] + temp[i][j-1];
                if(temp[i][j] == 1)
                {
                    // Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                    if(alive < 2) 
                    {
                        board[i-1][j-1] = 0;
                    }
                    // Any live cell with two or three live neighbors lives on to the next generation.
                    else if(alive <= 3 && alive >= 2)
                    {
                        board[i-1][j-1] = 1;
                    }
                    // Any live cell with more than three live neighbors dies, as if by over-population..
                    else if(alive > 3)
                    {
                        board[i-1][j-1] = 0;
                    }
                }
                // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                else
                {
                    if(alive == 3)
                    {
                        board[i-1][j-1] = 1;
                    }
                }
            }
        }
    }
}
