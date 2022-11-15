package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A199二叉树的右视图 {

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(list, root, 0);
        return list;
    }

    public void dfs(List<Integer> list, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if(list.size() == depth) list.add(root.val);
        dfs(list, root.right, depth + 1);
        dfs(list, root.left, depth + 1);
    }
}
