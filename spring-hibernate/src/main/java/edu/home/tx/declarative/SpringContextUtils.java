package edu.home.tx.declarative;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtils {

    private static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("applicationcontext_declarative_tx.xml");
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
