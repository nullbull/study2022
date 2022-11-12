package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A102二叉树的层序遍历 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            List<Integer> level = new ArrayList<>();
            while (!queue.isEmpty()) {
                level.add(queue.peekFirst().val);
                TreeNode cur = queue.pollFirst();
                if (cur.left != null) {
                    temp.add(cur.left);
                }
                if (cur.right != null) {
                    temp.add(cur.right);
                }
            }
            res.add(level);
            queue.addAll(temp);
        }
        return res;
    }

}
