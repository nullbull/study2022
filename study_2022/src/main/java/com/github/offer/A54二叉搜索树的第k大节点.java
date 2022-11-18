package com.github.offer;

import com.github.TreeNode;
import java.util.TreeMap;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A54二叉搜索树的第k大节点 {

    int res = 0;
    int count = 0;
    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }

    public void dfs(TreeNode root, int k) {
        if (root == null) return;
        dfs(root.right, k);
        count++;
        if (count == k) {
            res = root.val;
        }
        dfs(root.left, k);
    }

}
