package edu.home.tx.programmatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtils {

    private static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("applicationcontext_programatic_tx.xml");
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
