package edu.home.hibernate;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("custdao")
public class CustomerDaoImpl implements CustomerDao {
	@Autowired(required=true)
	private HibernateTemplate hibernateTemplate;

	public CustomerDaoImpl() {}

	public void save(final Customer c) {
		//anonymous approach
		hibernateTemplate.execute(new HibernateCallback<Object>() {

            public Object doInHibernate(Session session) throws HibernateException {
                Integer iRef = (Integer) session.save(c);
                return iRef;
            }
			
		});

		// short cut approach
		//hibernateTemplate.save(c);
	}

	//@Override
	public void delete(int eno) {
	}

	//@Override
	public Customer get(int eno) {
		return null;
	}

	//@Override
	public void update(Customer e) {
	}
}
