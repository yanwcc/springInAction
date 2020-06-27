package cn.com.springtest;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author yanwc
 * @date 2019/12/3 18:39
 */
@Service
public class ServiceTest {

    @PostConstruct
    public void init(){
        System.out.println("sss");
    }
}
