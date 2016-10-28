
package com.akmozo.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    
    private static final Logger LOG = Logger.getLogger("my-aspect");
    
    @Before("execution(* com..Test.method01(..))")
    public void testBeforeTestMethod01(){
        LOG.info("---------------------------- before Test.method01(..)");
    }
    
}
