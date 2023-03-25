package com.github.thread;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.09
 */
public class Test {

    private static volatile Test instance;


    private Test() {
    }
    public static Test getInstance() {
        if (instance == null) {
            synchronized (Test.class) {
                if (instance == null) {
                    instance = new Test();
                }
            }
        }
        return instance;
    }

}
