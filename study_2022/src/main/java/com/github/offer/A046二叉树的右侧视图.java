package com.github.offer;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.06
 */
public class A046二叉树的右侧视图 {

    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode root, int level) {
        if(root == null) return;
        if (level == res.size()) {
            res.add(root.val);
        }
        dfs(root.right, level + 1);
        dfs(root.left, level + 1);
    }

}
