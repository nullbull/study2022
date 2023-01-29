package com.github.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.09
 */
public class Testc {

    public static class Fruit {

    }

    public static class Apple extends Fruit {

    }

    public static void printFruit(List<? extends Fruit> fruits) {

    }
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple());
        printFruit(list);

    }

}
