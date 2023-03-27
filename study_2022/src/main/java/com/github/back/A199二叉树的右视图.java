package com.github.back;

import com.github.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niuzhenhao
 * @date 2023/3/26 22:31
 * @desc
 */
public class A199二叉树的右视图 {

    List<Integer> res = new ArrayList<>();
    TreeNode pre = null;
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (res.size() == depth) {
            res.add(root.val);
        }
        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }
}
