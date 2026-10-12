package com.zz;

import com.zz.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: DemoApplication
 * @author: zhangzhou
 * @date: 2026/10/10 下午3:36
 * @description:
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Via http://127.0.0.1:8099/ to trigger this demo.");
    }
}
