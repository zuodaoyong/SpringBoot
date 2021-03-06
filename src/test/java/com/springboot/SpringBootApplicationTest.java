package com.springboot;

import com.springboot.bean.Person;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.http.HttpEncodingProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {

    @Value("${name}")
    private String name;
    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext context;
    @Autowired
    private HttpEncodingProperties httpEncodingProperties;
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void testPerson_yml(){
        System.out.println(person);
        /*System.out.println(httpEncodingProperties.isForce());
        logger.trace("trace日志");
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");*/
    }

    @Test
    public void testHelloService(){
        boolean b = context.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void testproperties(){
        System.out.println(name);
    }
}
