package com.github;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.06
 */
public class BBB {


    private static class ThreadA implements Runnable {

        private Object lock;
        private Object pre;

        public ThreadA(Object pre, Object lock) {
            this.lock = lock;
            this.pre = pre;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (pre) {
                    synchronized (lock) {
                        System.out.println("A");
                        lock.notifyAll();
                    }
                    try {
                        pre.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
    }

    private static class ThreadB implements Runnable {

        private Object lock;
        private Object pre;

        public ThreadB(Object pre, Object lock) {
            this.lock = lock;
            this.pre = pre;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (pre) {
                    synchronized (lock) {
                        System.out.println("B");
                        lock.notifyAll();
                    }
                    try {
                        pre.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();
        Object pre = new Object();

        ThreadA a = new ThreadA(pre, lock);
        ThreadB b = new ThreadB(lock, pre);
        new Thread(a).start();
        new Thread(b).start();


    }

}
