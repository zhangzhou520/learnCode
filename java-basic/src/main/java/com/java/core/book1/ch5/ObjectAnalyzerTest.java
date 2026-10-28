package com.java.core.book1.ch5;

import java.util.ArrayList;

/**
 * @author zhangzhou
 * @date 2026/10/28 14:41
 **/
public class ObjectAnalyzerTest {

    public static void main(String[] args) throws ReflectiveOperationException {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
