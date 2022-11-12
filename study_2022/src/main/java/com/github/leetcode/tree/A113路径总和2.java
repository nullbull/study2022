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
public class A113路径总和2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        dfs(path, root, targetSum);
        return res;
    }

    public void dfs(List<Integer> path, TreeNode root, int targetSum) {
        if (root == null) return;
        List<Integer> temp = new ArrayList<>(path);
        temp.add(root.val);
        if (root.val == targetSum && root.left == null && root.right == null) {
            res.add(temp);
        }
        dfs(temp, root.left, targetSum - root.val);
        dfs(temp, root.right, targetSum - root.val);
    }
}
