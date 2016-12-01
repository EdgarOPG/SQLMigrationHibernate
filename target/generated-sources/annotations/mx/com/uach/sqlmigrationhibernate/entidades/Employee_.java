package mx.com.uach.sqlmigrationhibernate.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> lastName;
	public static volatile SingularAttribute<Employee, Date> hireDate;
	public static volatile CollectionAttribute<Employee, JobHistory> jobHistoryCollection;
	public static volatile SingularAttribute<Employee, Department> departmentId;
	public static volatile SingularAttribute<Employee, Integer> employeeId;
	public static volatile SingularAttribute<Employee, Employee> managerId;
	public static volatile SingularAttribute<Employee, BigDecimal> salary;
	public static volatile SingularAttribute<Employee, BigDecimal> commissionPct;
	public static volatile CollectionAttribute<Employee, Department> departmentCollection;
	public static volatile SingularAttribute<Employee, String> firstName;
	public static volatile SingularAttribute<Employee, Job> jobId;
	public static volatile SingularAttribute<Employee, String> phoneNumber;
	public static volatile CollectionAttribute<Employee, Employee> employeeCollection;
	public static volatile SingularAttribute<Employee, String> email;

}

