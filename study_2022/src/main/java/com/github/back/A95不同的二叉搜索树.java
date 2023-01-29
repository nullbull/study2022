package com.github.back;

import com.github.ListNode;
import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.05
 */
public class A95不同的二叉搜索树 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return dfs(1, n);
    }

    public List<TreeNode> dfs(int left, int right) {
        List<TreeNode> res = new ArrayList<>();
        if (left > right) {
            res.add(null);
            return res;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> lefts = dfs(left, i - 1);
            List<TreeNode> rights = dfs(i + 1, right);
            for (TreeNode l : lefts) {
                for (TreeNode r : rights) {
                    TreeNode root = new TreeNode(i);
                    root.right = r;
                    root.left = l;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
