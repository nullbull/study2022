package com.github.offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.03
 */
public class II036后缀表达式 {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) return 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (String v : tokens) {
            if (v.equals("+") || v.equals("-") || v.equals("*") || v.equals("/")) {
                int v1 = queue.pollLast();
                int v2 = queue.pollLast();
                if (v.equals("+")) {
                    queue.addLast(v1 + v2);
                } else if (v.equals("-")) {
                    queue.addLast( v2 - v1);
                } else if (v.equals("*")) {
                    queue.addLast(v1 * v2);
                } else  {
                    queue.addLast( v2 / v1);
                }
            } else {
                queue.addLast(Integer.valueOf(v));
            }
        }
        return queue.pollFirst();
    }

    public static void main(String[] args) {
        new II036后缀表达式().evalRPN(new String[]{"3",  "1" ,"2", "*", "+"});
    }
}
