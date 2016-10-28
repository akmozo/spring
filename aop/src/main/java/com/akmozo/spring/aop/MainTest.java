package com.akmozo.spring.aop;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    
/*
    http://www.tutorialspoint.com/spring/aspectj_based_aop_appoach.htm
    https://www.mkyong.com/spring3/spring-aop-aspectj-annotation-example/
*/
    
    private final static Logger LOG = Logger.getLogger("main-test");

    public static void main(String[] args) { 
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        //BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");        
        
        //Test test = beanFactory.getBean(Test.class);        
        //LOG.info(test.method01(25));        
    }
    
}
