package com.on.java.basic.ch10.interfaces;

/**
 * @author zhangzhou
 * @date 2026/10/21 10:01
 **/
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Service1Factory());
        serviceConsumer(new Service2Factory());
    }
}

interface Service {

    void method1();

    void method2();
}

interface ServiceFactory {

    Service getService();
}

class Service1 implements Service {

    //包访问权限
    Service1() {

    }

    @Override
    public void method1() {
        System.out.println("Service1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Service1 method2");
    }
}

class Service1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Service1();
    }
}

class Service2 implements Service {

    //包访问权限
    Service2() {

    }

    @Override
    public void method1() {
        System.out.println("Service2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Service2 method2");
    }
}

class Service2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Service2();
    }
}