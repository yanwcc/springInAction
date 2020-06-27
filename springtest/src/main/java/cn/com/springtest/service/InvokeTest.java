package cn.com.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yanwc
 * @date 2020/6/27 16:12
 */
@Component
public class InvokeTest {

    @Autowired
    private UserService userService;

    public void invok(){
        userService.creatUser("yy",200);
    }
}
