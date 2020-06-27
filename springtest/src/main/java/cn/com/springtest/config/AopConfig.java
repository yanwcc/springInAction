package cn.com.springtest.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author yanwc
 * @date 2020/6/27 15:52
 */
@Aspect
@Component
public class AopConfig {

    @Pointcut("execution(* cn.com.springtest.service.impl.*.*(..))")
    public void preFunction(){
    }

    @Before("preFunction()")
    public void before(){
        System.out.println("执行之前");
    }
}
