package mx.com.uach.sqlmigrationhibernate.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Location.class)
public abstract class Location_ {

	public static volatile SingularAttribute<Location, String> streetAddress;
	public static volatile SingularAttribute<Location, String> city;
	public static volatile SingularAttribute<Location, Short> locationId;
	public static volatile SingularAttribute<Location, String> postalCode;
	public static volatile SingularAttribute<Location, String> stateProvince;
	public static volatile SingularAttribute<Location, Countrie> countryId;
	public static volatile CollectionAttribute<Location, Department> departmentCollection;

}

