package com.github.thread;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.03
 */
public class TestB {

    static class ThreadA implements Runnable {

        private Object pre;
        private Object current;
        private String val;
        int count = 10;

        public ThreadA(Object pre, Object current, String val) {
            this.pre = pre;
            this.current = current;
            this.val = val;
        }

        @Override
        public void run() {
            while (count > 0) {
                synchronized (pre) {
                    synchronized (current) {
                        count--;
                        System.out.println(Thread.currentThread() + " print " + val);
                        current.notifyAll();
                    }
                    try {
                        pre.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadA runA = new ThreadA(c, a, "A");
        ThreadA runB = new ThreadA(a, b, "B");
        ThreadA runC = new ThreadA(a, c, "C");
        new Thread(runA).start();
//        Thread.sleep(10);
        new Thread(runB).start();
//        Thread.sleep(10);
        new Thread(runC).start();
//        Thread.sleep(10);
    }


}
