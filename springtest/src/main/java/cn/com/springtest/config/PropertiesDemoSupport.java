package cn.com.springtest.config;

import com.alibaba.dubbo.common.extension.Activate;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PropertiesLoaderSupport;

import java.io.IOException;
import java.util.Properties;

/**
 * @author yanwc
 * @date 2020/5/14 17:13
 */
public class PropertiesDemoSupport extends PropertiesLoaderSupport implements FactoryBean<Properties> {


    public Properties getObject() throws Exception {
        Properties properties = new Properties();

        loadProperties(properties);
        return properties;
    }

    public Class<?> getObjectType() {
        return Properties.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
