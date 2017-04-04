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
public class PlusOne 
{
    public int[] plusOne(int[] digits) {
        int carryOver = 1;
        int newLen = 0;
        for(int i = digits.length-1; i >= 0; i--)
        {
            if(digits[i] == 9 && carryOver == 1)
            {
                digits[i] = 0;
                carryOver = 1;
            }
            else
            {
                if(carryOver == 1 && digits[i] != 9)
                {
                    digits[i] = digits[i] + 1;
                    carryOver = 0;
                }
            }
        }
        if(carryOver == 1)
        {
            newLen = digits.length + 1;
            int[] result = new int[newLen];
            for(int i = digits.length-1; i >= 0; i--)
            {
                result[i+1] = digits[i];
            }            
            result[0] = 1;
            return result;
        }
        else
        {
            return digits;
        }
        

    }
}
