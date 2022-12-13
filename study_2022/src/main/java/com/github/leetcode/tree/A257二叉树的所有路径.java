package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.02
 */
public class A257二叉树的所有路径 {


    List<List<Integer>> res = new ArrayList<>();


    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<String> collect = res.stream().map(a -> a.stream().map(String::valueOf).collect(Collectors.joining("->")))
                .collect(Collectors.toList());

        return collect;
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        dfs(root.left, list);
        dfs(root.right, list);
        list.remove(list.size() - 1);
    }
}
