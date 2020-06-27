package cn.com.service.impl;

import cn.com.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author yanwc
 * @date 2019/12/21 17:28
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHell(String name) {
        return "Hello World" + name;
    }

    public Integer findName(Integer id) {
        return id;
    }
}
