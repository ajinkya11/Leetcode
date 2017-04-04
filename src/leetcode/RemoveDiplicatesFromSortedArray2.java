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
public class RemoveDiplicatesFromSortedArray2 
{
    public int removeDuplicates(int[] A) 
    {
       if (A.length <= 2)
			return A.length;
 
		int prev = 1; // point to previous
		int curr = 2; // point to current
 
		while (curr < A.length) 
		{
			if (A[curr] == A[prev] && A[curr] == A[prev - 1])
			{
				curr++;
			}
			else
			{
				prev++;
				A[prev] = A[curr];
				curr++;
			}
		}
 
		return prev + 1;
    }
}
