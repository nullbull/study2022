package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A108将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        int[] left = new int[mid];
        int[] right = new int[nums.length-mid-1];
        System.arraycopy(nums, 0, left, 0, mid);
        if (mid + 1 < nums.length) {
            System.arraycopy(nums, mid + 1, right, 0, nums.length - mid - 1);
        }
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }

    public static void main(String[] args) {
        new A108将有序数组转换为二叉搜索树().sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
