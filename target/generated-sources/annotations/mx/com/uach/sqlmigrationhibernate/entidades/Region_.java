package mx.com.uach.sqlmigrationhibernate.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Region.class)
public abstract class Region_ {

	public static volatile SingularAttribute<Region, BigDecimal> regionId;
	public static volatile SingularAttribute<Region, String> regionName;
	public static volatile CollectionAttribute<Region, Countrie> countrieCollection;

}

