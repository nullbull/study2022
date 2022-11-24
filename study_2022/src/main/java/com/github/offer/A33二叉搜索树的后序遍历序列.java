package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A33二叉搜索树的后序遍历序列 {

    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder, 0, postorder.length - 1);
    }

    public boolean dfs(int[] postorder, int left, int right) {
        if (left >= right) {
            return true;
        }
        int i = left;
        int end = right;
        while (postorder[i] < postorder[end]) {
            i++;
        }
        int mid = i;
        while (postorder[i] > postorder[end]) {
            i++;
        }
        return i == end && dfs(postorder, left, mid-1) && dfs(postorder, mid, right - 1);
    }
}
