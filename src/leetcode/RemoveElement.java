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
public class RemoveElement 
{
    public int removeElement(int[] A, int elem) 
    {
        int i=0;
        int j=0;
 
        while(j < A.length)
        {
            if(A[j] != elem)
            {
                A[i] = A[j];
                i++; 
            }
 
            j++;
        }
 
        return i;
    }
}
