package cn.com.springtest.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author yanwc
 * @date 2020/5/14 11:07
 */

public class LogArgsAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("准备执行方法" + method.getName() + ",参数列表" + Arrays.toString(objects));
    }

}
