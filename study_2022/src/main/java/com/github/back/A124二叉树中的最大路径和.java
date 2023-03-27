package com.github.back;

import com.github.TreeNode;

/**
 * @author niuzhenhao
 * @date 2023/3/25 16:46
 * @desc
 */
public class A124二叉树中的最大路径和 {

    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left >= 0 && right >=0 ) {
            res = Math.max(root.val + left + right, res);
        } else if (left >= 0) {
            res = Math.max(root.val + left, res);
        } else if (right >= 0){
            res = Math.max(root.val + right, res);
        } else {
            res = Math.max(root.val, res);
        }
        return root.val + (Math.max(Math.max(left, right), 0)) ;
    }

}
