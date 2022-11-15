package com.github.offer;

import com.github.ListNode;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class A12矩阵中的路径 {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(0, board, i, j, word.toCharArray())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public boolean dfs(int queue, char[][] board, int i, int j, char[] str) {
        if (queue == str.length) {
            return true;
        }
        if (!isOverBoard(board, i, j)) {
            return false;
        }
        if (board[i][j] != str[queue]) {
            return false;
        } else {
            board[i][j] = '1';
            boolean res = dfs(queue + 1, board, i + 1, j, str) ||
                    dfs(queue + 1, board, i - 1, j, str) ||
                    dfs(queue + 1, board, i, j + 1, str) ||
                    dfs(queue + 1, board, i, j - 1, str);
            board[i][j] = str[queue];
            return res;
        }
    }

    public boolean isOverBoard(char[][] board, int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
    }

    public static void main(String[] args) {
        char[][] aa = new char[][]{
                new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'E', 'S'},
                new char[]{'A', 'D', 'E', 'E'},
        };
        new A12矩阵中的路径().exist(aa, "ABCESEEEFS");
    }
}
