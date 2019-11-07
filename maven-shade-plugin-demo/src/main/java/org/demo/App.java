package org.demo;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.info("Hello World!");
        System.out.println(JSON.toJSONString(new String[]{"Hello", "world"}));
    }
}
