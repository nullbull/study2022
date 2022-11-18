package com.github.leetcode.dfs;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A130被围绕的区域 {

    public void solve(char[][] board) {
        if (board.length == 0 || board.length == 1) return;
        char target = 'O';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((i == 0 || i ==  board.length-1 || j == 0 || j == board[0].length-1) && board[i][j] == target) {
                    dfs(board,i,j);
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0 ; j < board[0].length; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][]board, int i, int j) {
        if (!(i>=0 && i < board.length && j >=0 && j < board[0].length) || board[i][j] != 'O') return;
        board[i][j] = '#';
        dfs(board, i+1, j );
        dfs(board, i-1, j );
        dfs(board, i, j -1 );
        dfs(board, i, j + 1 );
    }


//    public void changeBoard(char[][] board, char target, char to) {
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][0] == target) {
//                board[i][0] = to;
//            }
//            if (board[i][board[0].length - 1] == target) {
//                board[i][board[0].length - 1] = to;
//            }
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            if (board[0][i] == target) {
//                board[0][i] = 'o';
//            }
//            if (board[board.length - 1][i] == target) {
//                board[board.length - 1][i] = to;
//            }
//        }
//    }
}
