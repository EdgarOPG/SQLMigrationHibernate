package mx.com.uach.sqlmigrationhibernate.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Job.class)
public abstract class Job_ {

	public static volatile SingularAttribute<Job, String> jobId;
	public static volatile SingularAttribute<Job, Integer> maxSalary;
	public static volatile CollectionAttribute<Job, JobHistory> jobHistoryCollection;
	public static volatile SingularAttribute<Job, String> jobTitle;
	public static volatile CollectionAttribute<Job, Employee> employeeCollection;
	public static volatile SingularAttribute<Job, Integer> minSalary;

}

