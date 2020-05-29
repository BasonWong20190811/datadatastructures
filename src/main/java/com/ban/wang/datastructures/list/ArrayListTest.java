package com.ban.wang.datastructures.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangban
 * 学习ArrayList的原理
 */
public class ArrayListTest {

    public static void main(String[] args) {
        test();
//        List<String> list = new ArrayList<>();
    }

    /**
     * ArrayList
     */
    public static void test(){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.remove(1);
        System.out.println();
    }

}
