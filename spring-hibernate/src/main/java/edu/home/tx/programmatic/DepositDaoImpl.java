package edu.home.tx.programmatic;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class DepositDaoImpl
        extends HibernateDaoSupport {

    public Deposit read(int id) {
        return (Deposit) getHibernateTemplate().get(Deposit.class, new Integer(id));
    }

    public void update(Deposit w) {
        getHibernateTemplate().update(w);
    }
}
