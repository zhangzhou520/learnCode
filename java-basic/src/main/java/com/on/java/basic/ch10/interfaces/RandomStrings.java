package com.on.java.basic.ch10.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author zhangzhou
 * @date 2026/10/20 17:13
 * 通过实现接口来适配方法
 **/
public class RandomStrings implements Readable {

    private static Random random = new Random(47);
    private static final char[] CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] LOWERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] VOWELS = "aeiou".toCharArray();
    private int count;

    public RandomStrings(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(CAPITALS[random.nextInt(CAPITALS.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(VOWELS[random.nextInt(VOWELS.length)]);
            cb.append(LOWERS[random.nextInt(LOWERS.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomStrings(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
