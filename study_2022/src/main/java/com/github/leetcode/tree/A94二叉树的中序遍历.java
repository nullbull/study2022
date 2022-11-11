package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.TransactionRequiredException;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A94二叉树的中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }
    public void dfs(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(res, root.left);
        res.add(root.val);
        dfs(res, root.right);
    }

}
