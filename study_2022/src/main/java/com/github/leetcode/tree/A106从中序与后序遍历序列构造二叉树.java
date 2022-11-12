package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A106从中序与后序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 ) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int midIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                midIndex = i;
                break;
            }
        }
        int leftLen = midIndex;
        int rightLen = inorder.length - midIndex - 1;
        int[] postLeft = new int[leftLen];
        int[] postRight = new int[rightLen];
        System.arraycopy(postorder, 0, postLeft, 0 , leftLen );
        System.arraycopy(postorder, leftLen,  postRight, 0 , rightLen );
        int[] inLeft = new int[leftLen];
        int[] inRight = new int[rightLen];
        System.arraycopy(inorder, 0, inLeft, 0 , leftLen );
        System.arraycopy(inorder, midIndex + 1,  inRight, 0 , rightLen );
        root.left = buildTree(inLeft, postLeft);
        root.right = buildTree(inRight, postRight);
        return root;
    }

    public static void main(String[] args) {
        new A106从中序与后序遍历序列构造二叉树().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9,15,7,20,3} );
    }
}
