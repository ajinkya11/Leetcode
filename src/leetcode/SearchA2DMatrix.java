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
public class SearchA2DMatrix 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int row = 0;
        int col = colNum-1;
        while(row < rowNum && row >= 0 && col < colNum && col >=0)
        {
            if(target == matrix[row][col])
            {
                return true;
            }
            else if(target > matrix[row][col])
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return false;
    }
}
