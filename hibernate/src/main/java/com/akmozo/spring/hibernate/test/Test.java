
package com.akmozo.spring.hibernate.test;

import com.akmozo.spring.hibernate.entity.Client;
import com.akmozo.spring.hibernate.entity.PersonneDAO;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    
    private static final Logger LOG = Logger.getLogger(Test.class.getName());
    
    public static void main(String[] args) {
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        
        Client client = new Client(null, "nom", "prenom", "adresse", "email", "mot_de_passe");
        
        PersonneDAO pDAO = appContext.getBean("zbean", PersonneDAO.class);
        pDAO.addClient(client);
        
    }
    
}
