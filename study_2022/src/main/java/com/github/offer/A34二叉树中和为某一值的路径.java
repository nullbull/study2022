package com.github.offer;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.14
 */
public class A34二叉树中和为某一值的路径 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(new ArrayList<>(), root, target);
        return res;
    }
    public void dfs(List<Integer> list, TreeNode root, int target) {
        if (root == null) {
            return;
        }

        List<Integer> temp = new ArrayList<>(list);
        temp.add(root.val);
        if (root.right == null && root.left == null && target == 0) {
            res.add(list);
        }
        dfs(temp, root.left, target - root.val);
        dfs(temp, root.right, target - root.val);
    }
}
