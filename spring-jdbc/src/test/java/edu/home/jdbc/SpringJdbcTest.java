package edu.home.jdbc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_jdbc.xml")
public class SpringJdbcTest {
	@Autowired
	ApplicationContext context;
	@Test
	public void testSpringJdbc() {
		
		EmployeeDao empdao = (EmployeeDao)context.getBean("empdao");
		
		Employee e = new Employee();
		e.setEno(1);
		e.setEname("Ramesh");
		e.setDesig("Director");
		e.setSal(1000.0);
		empdao.save(e);
		System.out.println("Record inserted successfully...");
		
		System.out.println("Read customer details");
		Employee emp = empdao.get(1);
		System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getDesig()+"\t"+emp.getSal());
	}
}
