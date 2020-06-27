package cn.com;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author yanwc
 * @date 2019/12/21 16:34
 */
@Service
public class Demo {

    @PostConstruct
    public void init(){
        System.out.println("sss");
    }
}
