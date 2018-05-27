package com.springboot.config;

import com.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类是springboot的主配置类，类似于beans.xml
 * @Configuration:表明是配置类
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
