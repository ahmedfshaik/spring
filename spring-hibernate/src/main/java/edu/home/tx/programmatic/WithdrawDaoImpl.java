package edu.home.tx.programmatic;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class WithdrawDaoImpl
        extends HibernateDaoSupport {

    public Withdraw read(int id) {
        return (Withdraw) getHibernateTemplate().get(Withdraw.class, new Integer(id));
    }

    public void update(Withdraw w) {
        getHibernateTemplate().update(w);
    }
}
