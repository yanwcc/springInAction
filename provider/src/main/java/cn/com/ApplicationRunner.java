package cn.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yanwc
 * @date 2019/12/22 12:36
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
