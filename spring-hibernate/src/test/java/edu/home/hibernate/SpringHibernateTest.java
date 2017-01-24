package edu.home.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationcontext_hibernate.xml")
public class SpringHibernateTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void testSpringHibernate() {
        CustomerDao custDao = (CustomerDao) context.getBean("custdao");
        Customer c = new Customer();
        c.setCno(1);
        c.setCname("ramesh");
        c.setAddress("Ameerpet");
        c.setPhone(7799108899L);
        custDao.save(c);
        System.out.println("Record inserted successfully...");
    }
}
