package edu.home.hibernate;

public interface CustomerDao {

    void save(Customer e);

    void update(Customer e);

    void delete(int eno);

    Customer get(int eno);
}
