package com.github.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread a = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    try {
                        lock.notifyAll();
                        System.out.println(Thread.currentThread() + " print A");
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    try {
                        lock.notifyAll();
                        System.out.println(Thread.currentThread() + " print B");
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        a.start();
        b.start();

    }
}
