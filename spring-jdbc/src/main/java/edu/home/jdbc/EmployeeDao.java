package edu.home.jdbc;

public interface EmployeeDao {
	public void save(Employee e);

	public void update(Employee e);

	public void delete(int eno);

	public Employee get(int eno);
}
