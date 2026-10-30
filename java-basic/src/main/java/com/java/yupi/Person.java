package com.java.yupi;

/**
 * @author zhangzhou
 * @date 2026/10/30 13:58
 **/
public class Person {

    private String name;
    private Integer age;
    private String city;

    public Person() {
    }

    public Person(String city, Integer age, String name) {
        this.city = city;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
