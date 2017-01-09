package edu.home.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_proxy_based_aop.xml");
        Performer pRef = (Performer) context.getBean("proxybean");
        pRef.partice();
        pRef.perform();
    }
}
