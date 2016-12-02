package mx.com.uach.sqlmigrationhibernate.querys;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.uach.sqlmigrationhibernate.entidades.AllAllTables;

/**
 *
 * @author eopg9
 */
public class Queries {

    //TODO Con string format crear el create tables
    public void instert(String query) {
//    SQLDatabaseConnection.makeSqlServerQuery(query);
    }

    public Queries() {
        //  Creacion del EntityManager Oracle
    }
    EntityManagerFactory emfOracle = Persistence.createEntityManagerFactory("oraclePU");
    EntityManager emOracle = emfOracle.createEntityManager();

    public List<String> getTablenames(String user) {
        List<String> tablesnamesList = new ArrayList<>();
        Query qAllTablesOwners = emOracle
                .createNamedQuery("AllAllTables.findByTablespaceName")
                .setParameter("tablespaceName", "USERS");
        List<AllAllTables> tableNames = qAllTablesOwners.getResultList();
        for (AllAllTables name : tableNames) {
            tablesnamesList.add(name.getTableName());
        }
        return tablesnamesList;
    }

}
