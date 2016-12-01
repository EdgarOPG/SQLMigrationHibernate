package mx.com.uach.sqlmigrationhibernate.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(JobHistory.class)
public abstract class JobHistory_ {

	public static volatile SingularAttribute<JobHistory, Job> jobId;
	public static volatile SingularAttribute<JobHistory, JobHistoryPK> jobHistoryPK;
	public static volatile SingularAttribute<JobHistory, Date> endDate;
	public static volatile SingularAttribute<JobHistory, Department> departmentId;
	public static volatile SingularAttribute<JobHistory, Employee> employee;

}

