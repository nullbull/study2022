package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A95不同的二叉搜索树2 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        return generate(1, n);
    }
    public List<TreeNode> generate(int left, int right) {
        List<TreeNode> res =  new ArrayList<>();
        if (left > right) {
            res.add(null);
            return res;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> leftNodes = generate(left, i - 1);
            List<TreeNode> rightNodes = generate(i + 1, right);
            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;
                    res.add(node);
                }
            }
        }
        return res;
    }
}
