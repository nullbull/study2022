package com.github.leetcode.tree;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A96不同的二叉搜索树 {
    public int numTrees(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int left = numTrees(i-1);
            int right = numTrees(n - i);
            res += left * right;
        }
        return res;
    }
}
