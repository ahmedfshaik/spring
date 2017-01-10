package edu.home.proxy.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyAdvisorTest {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_proxy_advisor_based_aop.xml");
        Performer3 pRef = (Performer3) context.getBean("proxybean");
        System.out.println("*****Partice*****");
        pRef.partice();
        System.out.println("*****Perform*****");
        pRef.perform();
    }
}
