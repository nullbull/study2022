package com.github.thread;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.03
 */
public class ThreadPrint implements Runnable{
    public volatile static int state = 0;
    public String val;
    int count = 10;
    private int want;
    private int next;
    public ThreadPrint(String val, int want, int next) {
        this.val = val;
        this.want = want;
        this.next = next;
    }
    @Override
    public void run() {
        while (count > 0) {
            if (state == want) {
                System.out.println(Thread.currentThread() + " print " + val);
                state = next;
                count--;
            }
        }
    }

    public static void main(String[] args) {
        ThreadPrint a = new ThreadPrint("A", 0, 1);
        ThreadPrint b = new ThreadPrint("B", 1, 2);
        ThreadPrint c = new ThreadPrint("C", 2, 0);
        new Thread(a).start();
        new Thread(c).start();
        new Thread(b).start();
    }


}
