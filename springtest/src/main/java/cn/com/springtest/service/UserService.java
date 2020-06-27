package cn.com.springtest.service;
import cn.com.springtest.domain.User;

public interface UserService {

    User creatUser(String name, Integer age);

    User queryUser();
}
