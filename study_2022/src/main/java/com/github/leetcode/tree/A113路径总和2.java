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
        path.add(root.val);
        if (root.val == targetSum && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
            path.remove(path.size()-1);
        }
        dfs(path, root.left, targetSum - root.val);
        dfs(path, root.right, targetSum - root.val);
        path.remove(path.size()-1);
    }
}
