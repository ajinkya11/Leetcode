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


class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ConstructBinaryTreeFromInorderAndPostOrder 
{
    public TreeNode construct(int[] inorder, int[] postorder)
    {
        return construct(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    public TreeNode construct(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend)
    {
        if(instart > inend || poststart > postend) return null;
        
        int inIndex = 0;
        for(int i = 0; i < inorder.length; i++)
        {
            if(inorder[i] == postorder[postend])
            { 
                inIndex = i;
            }
        }
        TreeNode root = new TreeNode(postorder[postend]);
        
        root.left = construct(inorder, instart, inIndex-1, postorder, poststart, poststart+inIndex-instart-1);
        root.right = construct(inorder, inIndex+1, inend, postorder, poststart-instart+inIndex, postend-1);
        return root;
    }
}
