package cn.com.springtest.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * @author yanwc
 * @date 2020/5/14 11:09
 */

public class LogResultAdvice implements AfterReturningAdvice {


    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法返回" + o);
    }
}
