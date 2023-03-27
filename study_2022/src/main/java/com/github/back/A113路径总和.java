package com.github.back;

import com.github.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niuzhenhao
 * @date 2023/3/26 23:01
 * @desc
 */
public class A113路径总和 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(new ArrayList<>(), root, targetSum);
        return res;
    }

    public void dfs(List<Integer> list, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        list.add(root.val);
        target = target - root.val;
        dfs(list, root.left, target );
        dfs(list, root.right, target);
        list.remove(list.size() - 1);
    }
}
