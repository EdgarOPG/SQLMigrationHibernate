/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.uach.sqlmigrationhibernate.entidades.AllAllTables;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eopg9
 */
public class TestQueries {

    EntityManagerFactory emfOracle = Persistence.createEntityManagerFactory("oraclePU");
    EntityManager emOracle = emfOracle.createEntityManager();
    
    public TestQueries() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        List<String> tablesnamesList = new ArrayList<>();
        Query qAllTablesOwners = emOracle
                .createNamedQuery("AllAllTables.findByTablespaceName")
                .setParameter("tablespaceName", "HR");
        List<AllAllTables> tableNames = qAllTablesOwners.getResultList();
        for (AllAllTables name : tableNames) {
            System.out.println(name);
        }
    }
}
