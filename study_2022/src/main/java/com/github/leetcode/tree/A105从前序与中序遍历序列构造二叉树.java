package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A105从前序与中序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 ) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int midIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                midIndex = i;
                break;
            }
        }
        int leftLen = midIndex;
        int rightLen = preorder.length - midIndex - 1;
        int[] newLeft = new int[leftLen];
        int[] newRight = new int[rightLen];
        System.arraycopy(preorder, 1, newLeft, 0 , leftLen );
        System.arraycopy(preorder, 1 + leftLen,  newRight, 0 , rightLen );
        int[] inLeft = new int[leftLen];
        int[] inRight = new int[rightLen];
        System.arraycopy(inorder, 0, inLeft, 0 , leftLen );
        System.arraycopy(inorder, midIndex + 1,  inRight, 0 , rightLen );
        root.left = buildTree(newLeft, inLeft);
        root.right = buildTree(newRight, inRight);
        return root;
    }

    public static void main(String[] args) {
        new A105从前序与中序遍历序列构造二叉树().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }
}
