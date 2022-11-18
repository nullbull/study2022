package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A64求1加到N {

    public int sumNums(int n) {
        int res = n;
        boolean b = (res != 0) && (res += sumNums(n - 1)) > 0;
        return res;
    }

}
