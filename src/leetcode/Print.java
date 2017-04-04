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
public class Print 
{
    public void printAll()
    {
        for(int i = 1; i <= 25; i++)
        {
            System.out.println("<tr id = \""+i+"\" hidden = \"\">");
            for(int j = 1; j <= 25; j++)
            {
                System.out.println("<td id = \""+i+"td"+ j +"\" hidden = \"\">0</td>");
            }
            System.out.println("</tr>");
        }
    }
}
