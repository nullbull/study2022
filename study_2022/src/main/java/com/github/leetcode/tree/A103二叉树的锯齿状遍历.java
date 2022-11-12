package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A103二叉树的锯齿状遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        int levels = 0;
        while (!queue.isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            List<Integer> level = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode cur = null;
                cur = queue.pollFirst();
                if (cur.left != null) {
                    temp.add(cur.left);
                }
                if (cur.right != null) {
                    temp.add(cur.right);
                }
                level.add(cur.val);
            }
            if (levels % 2 == 1) {
                Collections.reverse(level);
            }
            res.add(level);
            queue.addAll(temp);
            levels++;
        }
        return res;
    }
}
