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
public class WordSearch 
{
    public boolean exists(char[][] board, String word)
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(dfs(board, word, i, j, 0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int row, int col, int index)
    {
        if(row < 0 || row >= board.length || col < 0 || col > board[0].length)
        {
            return false;
        }
if(board[row][col] == word.charAt(index)){
            char temp = board[row][col];
            board[row][col]='#';
            if(index==word.length()-1)
            {
                return true;
            }
            else if(dfs(board, word, row-1, col, index+1)
            ||dfs(board, word, row+1, col, index+1)
            ||dfs(board, word, row, col-1, index+1)
            ||dfs(board, word, row, col+1, index+1))
            {
                return true;
            }
            board[row][col]=temp;
        }
     
        return false;    
    }
}
