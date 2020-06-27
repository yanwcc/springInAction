package cn;

import cn.com.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yanwc
 * @date 2019/12/22 12:34
 */
public class ApplicationRunner {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        DemoService demoService = (DemoService) applicationContext.getBean("demoService");

        System.out.println(demoService.sayHell("闫文超"));

        System.out.println(demoService.findName(1000));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
