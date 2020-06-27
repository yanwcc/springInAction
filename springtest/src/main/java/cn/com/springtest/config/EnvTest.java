package cn.com.springtest.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author yanwc
 * @date 2020/6/27 15:12
 */
@Component
@PropertySource("classpath:test.properties")
public class EnvTest implements InitializingBean {

    @Autowired
    private Environment environment;


    public void afterPropertiesSet() throws Exception {
        System.out.println(environment.getProperty("a"));
    }
}
