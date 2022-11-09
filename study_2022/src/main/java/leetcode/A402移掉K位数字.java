package leetcode;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.09
 */
public class A402移掉K位数字 {

    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > chars[i]) {
                stack.pop();
                k--;
            }
            if (chars[i] != '0' || !stack.isEmpty()) {
                stack.push(chars[i]);
            }
        }
        StringBuilder res = new StringBuilder();
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        String ans = res.reverse().toString();
        if (ans.equals("")) {
            ans = "0";
        }
        return ans;
    }

    public static void main(String[] args) {
        String res = new A402移掉K位数字().removeKdigits("1432219", 3);
        System.out.println(res);
        res = new A402移掉K位数字().removeKdigits("1234567890", 9);
        System.out.println(res);
        res = new A402移掉K位数字().removeKdigits("10200", 1);
        System.out.println(res);
    }
}
