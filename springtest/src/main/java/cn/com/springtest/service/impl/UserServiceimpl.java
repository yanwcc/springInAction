package cn.com.springtest.service.impl;

import cn.com.springtest.domain.User;
import cn.com.springtest.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yanwc
 * @date 2020/5/14 11:05
 */
public class UserServiceimpl implements UserService {

    private static boolean flag;

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        UserServiceimpl.flag = flag;
    }

    private static User user;
    public User creatUser(String name, Integer age) {
        user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }


    public User queryUser() {
        return user;
    }
}
