package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.LinkedList;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.05
 */
public class A2415反转二叉树的奇数层 {

    public TreeNode reverseOddLevels(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (level % 2 == 1) {
                for (int i = 0; i <= size / 2; i++) {
                    TreeNode left = queue.get(i);
                    TreeNode right = queue.get(size - i - 1);
                    if (left == right) {
                        break;
                    }
                    int temp = left.val;
                    left.val = right.val;
                    right.val = temp;
                }
                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }
                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                }
            }
            level++;
        }
        return root;
    }

}
