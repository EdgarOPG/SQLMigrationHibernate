package mx.com.uach.sqlmigrationhibernate.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Countrie.class)
public abstract class Countrie_ {

	public static volatile SingularAttribute<Countrie, Region> regionId;
	public static volatile SingularAttribute<Countrie, String> countryName;
	public static volatile CollectionAttribute<Countrie, Location> locationCollection;
	public static volatile SingularAttribute<Countrie, String> countryId;

}

