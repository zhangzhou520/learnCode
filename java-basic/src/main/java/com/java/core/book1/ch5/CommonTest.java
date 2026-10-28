package com.java.core.book1.ch5;

import java.lang.reflect.Field;

/**
 * @author zhangzhou
 * @date 2026/10/28 13:59
 **/
public class CommonTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee harry = new Employee("Harry Hacker", 50000, 10, 1, 1999);
        Class cl = harry.getClass();
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        Object o = f.get(harry);
        f.set(harry, "洲");
        System.out.println(f);
    }
}
