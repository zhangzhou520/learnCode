package com.java.yupi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author zhangzhou
 * @date 2026/10/30 13:49
 **/
public class StreamTest {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // 传统的处理方式
//        List<String> result = new ArrayList<>();
//        for (String word : words) {
//            if (word.length() > 5) {
//                String upperCase = word.toUpperCase();
//                result.add(upperCase);
//            }
//        }
//        Collections.sort(result);

        // 使用 Stream 的方式
        List<String> result = words.stream()
                .filter(word -> word.length() > 5)    // 过滤长度大于 5 的单词
                .map(String::toUpperCase)             // 转换为大写
                .sorted()                             // 排序
                .collect(Collectors.toList());        // 收集结果
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 演示中间操作和终端操作
//        numbers.stream()
//                .filter(n -> n > 3)            // 中间操作：过滤大于3的数字
//                .map(n -> n * n)               // 中间操作：平方
//                .collect(Collectors.toList()); // 终端操作：收集结果


        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .filter(n -> n > 3) // 中间操作：过滤大于3的数字
                .map(n -> n * n)    // 中间操作：平方
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // 终端操作：按奇偶分组

        // 统计操作
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("数量：" + stats.getCount());
        System.out.println("总和：" + stats.getSum());
        System.out.println("平均值：" + stats.getAverage());
        System.out.println("最大值：" + stats.getMax());
        System.out.println("最小值：" + stats.getMin());

        List<Person> people = Arrays.asList(
                new Person("张三", 25, "北京"),
                new Person("鱼皮", 18, "上海"),
                new Person("李四", 25, "北京"),
                new Person("老二", 35, "上海")
        );

        // 按城市分组
        Map<String, List<Person>> byCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        // 按城市分组并统计年龄
        Map<String, Double> avgAgeByCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.averagingInt(Person::getAge)
                ));

        // 按城市分组并收集姓名
        Map<String, List<String>> namesByCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));

        List<Integer> largeList = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .collect(Collectors.toList());

        // 并行处理，只需要改一个方法调用
//        long parallelCount = largeList.parallelStream()
//                .filter(n -> isPrime(n))
//                .count();
    }
}
