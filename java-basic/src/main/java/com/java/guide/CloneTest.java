package com.java.guide;

/**
 * @author zhangzhou
 * @date 2026/11/12 19:10
 **/
public class CloneTest {

    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
        // true
        System.out.println(person1.getAddress() == person1Copy.getAddress());
    }
}
