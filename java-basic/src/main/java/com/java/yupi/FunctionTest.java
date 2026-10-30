package com.java.yupi;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @author zhangzhou
 * @date 2026/10/30 10:01
 **/
@Slf4j
public class FunctionTest {

    private static final Logger log = LoggerFactory.getLogger(FunctionTest.class);

    public static void main(String[] args) {
        // Predicate<T> 用于条件判断
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();  // 取反

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Function<T, R> 用于转换
        Function<String, Integer> stringLength = String::length;
        Function<Integer, String> intToString = Object::toString;

        // 函数组合
        Function<String, String> addPrefix = s -> "前缀-" + s;
        Function<String, String> addSuffix = s -> s + "-后缀";
        Function<String, String> combined = addPrefix.andThen(addSuffix);
        String result = combined.apply("鱼皮"); // "前缀-鱼皮-后缀"
        System.out.println(result);

        // Consumer<T> 用于消费数据（无返回值）
        Consumer<String> printer = System.out::println;
        Consumer<String> logger = s -> log.error("处理数据：{}", s);
        // 组合消费
        Consumer<String> combinedConsumer = printer.andThen(logger);

        // Supplier<T> 用于提供数据
        Supplier<String> randomId = () -> UUID.randomUUID().toString();
        Supplier<LocalDateTime> now = LocalDateTime::now;

        // BinaryOperator<T> 用于二元操作
        BinaryOperator<Integer> max = Integer::max;
        BinaryOperator<String> concat = (a, b) -> a + b;

        Calculator addition = (a, b) -> a + b;
        Calculator substraction = (a, b) -> a - b;
    }
}
