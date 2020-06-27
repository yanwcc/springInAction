import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yanwc
 * @date 2019/12/21 16:37
 */
public class DemoTest {

    public static void main(String[] args) {
        System.err.println("---------------Spring服务正在启动-------------------");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        try {
            System.err.println("---------------Spring服务启动已完成-------------------");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
