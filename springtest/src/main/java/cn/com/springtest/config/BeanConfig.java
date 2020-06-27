package cn.com.springtest.config;

import cn.com.springtest.condit.ConditionalConfig;
import cn.com.springtest.service.UserService;
import cn.com.springtest.service.impl.UserServiceimpl;
import org.springframework.context.annotation.*;

/**
 * @author yanwc
 * @date 2020/6/25 14:36
 */
@Configuration
public class BeanConfig {

     @Bean
     //设置作用域的代理类
    /* @Scope(proxyMode = ScopedProxyMode.INTERFACES)*/
     //@Conditional(ConditionalConfig.class)
    public UserService getUserService(){
         return new UserServiceimpl();
     }
}
