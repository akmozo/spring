package com.akmozo.spring.aop;

public class Test {
    
    public String method01(int i) throws ArithmeticException {    
        if(i > 100){
            throw new ArithmeticException("i doit être < 100");
        }
        return "Method 01 : " + String.valueOf(i);    
    }
    
    public String method02(int i){    
        return "Method 02 : " + String.valueOf(i);    
    }
    
    public String method03(int i){    
        return "Method 03 : " + String.valueOf(i);    
    }    
    
}
