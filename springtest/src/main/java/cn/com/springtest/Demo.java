package cn.com.springtest;

import cn.com.springtest.domain.User;
import cn.com.springtest.service.InvokeTest;
import cn.com.springtest.service.UserService;
import cn.com.springtest.service.impl.UserServiceimpl;
import cn.com.springtest.task.DemoPtest;
import cn.com.springtest.task.FlagContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author yanwc
 * @date 2019/12/3 18:39
 */
public class Demo{

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        InvokeTest bean = applicationContext.getBean(InvokeTest.class);

        bean.invok();


        /* UserService userService = applicationContext.getBean(UserService.class);

        userService.creatUser("yanwc",23);

        userService.queryUser();*/

       /* Properties properties = new Properties();
        try {
            InputStream resourceAsStream = new FileInputStream(new File("G:\\ideawork\\rabbitmqtest\\src\\main\\resources\\app.properties"));

            InputStream resourceAsStream1 = Demo.class.getClassLoader().getResourceAsStream("app.properties");
            properties.load(resourceAsStream);

            String aa = properties.getProperty("aa");

            System.out.println(aa);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
