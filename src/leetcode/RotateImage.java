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
public class RotateImage 
{
    public void rotate(int[][] matrix) 
    {
        int len = matrix.length;
        for(int layer = 0; layer < len/2; layer++)
        {
            int first = layer;
            int last = len-layer-1;
            
            for(int i = first; i < last; i++)
            {
                int offset = i - first;
                
                int top = matrix[first][i];
                
                matrix[first][i] = matrix[last - offset][first];
                
                matrix[last - offset][first] = matrix[last][last - offset];
                
                matrix[last][last - offset] = matrix[i][last];
                
                matrix[i][last] = top;
            }
        }
    }

}
