package com.github.leetcode.windows;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.plugin2.os.windows.Windows;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.10
 */
public class A3无重复字符的最长子串 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] pos = new int[256];
        Arrays.fill(pos, -1);
        int res = 0;
        int start = -1;
        for (int i = 0; i < chars.length; i++) {
            start = Math.max(pos[chars[i]], start);
            res = Math.max(res, i - start);
            pos[chars[i]] = i;
        }
        return res;
    }


//    class WindowsItem {
//
//        private volatile long timestamp;
//        private AtomicInteger count;
//
//        public long getTimeStamp() {
//            return timestamp;
//        }
//
//        public void setTimeStamp(long t) {
//            timestamp = t;
//        }
//
//        public int getCount() {
//            return count.get();
//        }
//
//        public void setCount(int c) {
//            count.set(c);
//        }
//
//        public int addCount(int c) {
//            count.getAndAdd(c);
//            return count.get();
//        }
//    }
//
//    static class Window {
//
//        private WindowsItem[] windows;
//        // 窗口大小
//        private int windowsSize;
//        // 流量限制
//        private int limit;
//        // 上一次窗口的请求时间戳
//        private volatile long lastTimestamp;
//        // 窗口时间间隔
//        private int timeInterval;
//
//        public Window(int windowsSize, int limit, int timeInterval) {
//            windows = new WindowsItem[windowsSize];
//            initWindowsItem();
//            this.limit = limit;
//            lastTimestamp = System.currentTimeMillis();
//            this.timeInterval = timeInterval;
//        }
//
//        public synchronized void initWindowsItem() {
//            for (WindowsItem item : windows) {
//                item.setCount(0);
//                item.setTimeStamp(System.currentTimeMillis());
//            }
//        }
//
//        /**
//         * 根据当前请求量判断是否能通过
//         *
//         * @param count 请求量
//         * @return true 能通过 flase 无法通过
//         */
//        public boolean canPass(int count) {
//            long current = System.currentTimeMillis();
//            if (current - lastTimestamp > timeInterval) {
//                lastTimestamp = current;
//                initWindowsItem();
//            }
//            int pos = (int) (current % windowsSize);
//            WindowsItem window = windows[pos];
//            if (current - window.getTimeStamp() > timeInterval) {
//                window.setCount(0);
//                window.addCount(count);
//            }
//            return sum(current) > limit;
//        }
//
//        /**
//         * 根据当前时间 计算滑动窗口流量大小
//         *
//         * @param current 当前时间戳
//         * @return 计算滑动窗口流量大小
//         */
//        private int sum(long current) {
//            int sum = 0;
//            for (WindowsItem item : windows) {
//                if (current - item.getTimeStamp() > timeInterval) {
//                    item.setCount(0);
//                }
//                sum += item.getCount();
//            }
//            return sum;
//        }
//
//        ConcurrentHashMap<String, Window> windowMap = new ConcurrentHashMap<>();
//        public void filter(String itemID) {
//            Window window = windowMap.get(itemID);
//            if (window == null) {
//                window = new Window(10, 5, 1000);
//                windowMap.put(itemID, window);
//            }
//            // 如果限流了 直接return
//            if (!window.canPass(1)) {
//                return;
//            }
//            doFilter();
//        }
//
//        /**
//         * 开启定时任务定时清理 每个商品对应的时间窗口
//         */
//        public void clearWindowMap() {
//            new Thread(() -> {
//                while (true) {
//                    Iterator<Entry<String, Window>> it = windowMap.entrySet().iterator();
//                    while (it.hasNext()) {
//                        Entry<String, Window> next = it.next();
//                        // 如果1分钟只能该商品没有流量，删除该商品对应的时间窗口
//                        if (System.currentTimeMillis() - next.getValue().lastTimestamp >= 60000 {
//                            it.remove();
//                        }
//                    }
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }



    public static void main(String[] args) {
        new A3无重复字符的最长子串().lengthOfLongestSubstring("abcd");


    }


}

