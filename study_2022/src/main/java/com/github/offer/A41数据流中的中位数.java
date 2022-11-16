package com.github.offer;

import java.util.PriorityQueue;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A41数据流中的中位数 {


    public A41数据流中的中位数() {

    }

    private class MedianFinder {

        private PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> (a - b));
        private PriorityQueue<Integer> big = new PriorityQueue<>((a, b) -> (b - a));

        public void addNum(int num) {
            if (small.size() == big.size()) {
                big.offer(num);
                small.offer(big.poll());
            } else {
                small.offer(num);
                big.offer(small.poll());
            }
        }

        public double findMedian() {
            if (small.size() == big.size()) {
                if (!small.isEmpty() && !big.isEmpty()) {
                    return (small.peek() + big.peek()) / 2.0;
                }
            }
            return small.peek();
        }
    }


}
