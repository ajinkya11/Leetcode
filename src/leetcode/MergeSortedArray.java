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
public class MergeSortedArray 
{
    public void mergeArray(int[] nums1, int[] nums2, int m , int n)
    {
        while(m > 0 && n > 0)
        {
            if(nums1[m-1] >nums2[n-1])
            {
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
            else
            {
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
        while(n > 0)
        {
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
    }
}
