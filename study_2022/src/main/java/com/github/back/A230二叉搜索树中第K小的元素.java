package com.github.back;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.26
 */
public class A230二叉搜索树中第K小的元素 {

    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k, new ArrayList<>());
        return res;
    }

    public void dfs(TreeNode root, int k, List<Integer> list) {
        if (root == null) return;
        dfs(root.left, k, list);
        list.add(root.val);
        if (list.size() == k) {
            res = root.val;
            return;
        }
        dfs(root.right, k, list);
    }
}
