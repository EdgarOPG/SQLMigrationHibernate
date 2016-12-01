package mx.com.uach.sqlmigrationhibernate.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static volatile SingularAttribute<Department, String> departmentName;
	public static volatile CollectionAttribute<Department, JobHistory> jobHistoryCollection;
	public static volatile SingularAttribute<Department, Location> locationId;
	public static volatile SingularAttribute<Department, Short> departmentId;
	public static volatile CollectionAttribute<Department, Employee> employeeCollection;
	public static volatile SingularAttribute<Department, Employee> managerId;

}

