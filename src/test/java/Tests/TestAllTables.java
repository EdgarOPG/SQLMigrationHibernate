package Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.uach.sqlmigrationhibernate.entidades.Country;
import mx.com.uach.sqlmigrationhibernate.entidades.Department;
import mx.com.uach.sqlmigrationhibernate.entidades.Location;
import mx.com.uach.sqlmigrationhibernate.entidades.Region;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author eopg9
 */
public class TestAllTables {
    
    public TestAllTables() {
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
    //  Creacion del EntityManager Oracle
        EntityManagerFactory emfOracle = Persistence.createEntityManagerFactory("oraclePU");
        EntityManager emOracle = emfOracle.createEntityManager();
        
    //  Creacion del EntityManager Oracle
        EntityManagerFactory emfSqlServer = Persistence.createEntityManagerFactory("sqlServerPU");
        EntityManager emSqlServer = emfSqlServer.createEntityManager();
        
//    //  Operacion SELECT * tables names
//            Query qAllTablesNames = emOracle.createNamedQuery("AllAllTables.findByOwner").setParameter("owner", "HR");
//        List<AllAllTables> tables = qAllTablesNames.getResultList();        
//        for (AllAllTables table : tables) {
//            System.out.println(table.getTableName());
//        }
//        
//    //  Operacion SELECT * tables owners
//            Query qAllTablesOwners = emOracle.createNamedQuery("AllAllTables.findByTablespaceName").setParameter("tablespaceName", "USERS");
//        List<AllAllTables> tables2 = qAllTablesOwners.getResultList();        
//        for (AllAllTables table2 : tables2) {
//            System.out.println(table2.getOwner());
//        }

    //  Operacion SELECT *
        Query queryRegion = emOracle.createNamedQuery("Region.findAll");
        List<Region> regions = queryRegion.getResultList();
        List<Region> PersistRegions = new ArrayList<>();
        for (Region region : regions) {
            PersistRegions.add(region);
        }
        emOracle.close();
        for (Region region : PersistRegions) {
            System.out.println(region.toString());
        }
        
        for (Region region : PersistRegions) {
            emSqlServer.getTransaction().begin();        
            emSqlServer.persist(region);
            emSqlServer.getTransaction().commit();         
        } 
    //          Operacion SELECT *
        emOracle = emfOracle.createEntityManager();
        Query CountriesLocations = emOracle.createNamedQuery("Country.findAll");
        List<Country> countries = CountriesLocations.getResultList();
        List<Country> PersistCountries = new ArrayList<>();
        for (Country countrie : countries) {
            PersistCountries.add(countrie);
        }
        emOracle.close();
        for (Country countrie : PersistCountries) {
            System.out.println(countrie.toString());
        }
        
        for (Country countrie : PersistCountries) {
            emSqlServer.getTransaction().begin();        
            emSqlServer.persist(countrie);
            emSqlServer.getTransaction().commit();         
        }        
            //  Operacion SELECT *
        emOracle = emfOracle.createEntityManager();
        Query queryLocations = emOracle.createNamedQuery("Location.findAll");
        List<Location> locations = queryLocations.getResultList();
        List<Location> PersistLocation = new ArrayList<>();
        for (Location location : locations) {
            PersistLocation.add(location);
        }
        emOracle.close();
        for (Location location : PersistLocation) {
            System.out.println(location.toString());
        }
        
        for (Location location : PersistLocation) {
            emSqlServer.getTransaction().begin();        
            emSqlServer.persist(location);
            emSqlServer.getTransaction().commit();         
        }        
            //  Operacion SELECT *
        emOracle = emfOracle.createEntityManager();
        Query queryDepartments = emOracle.createNamedQuery("Department.findAll");
        List<Department> departments = queryDepartments.getResultList();
        List<Department> PersistDepartments = new ArrayList<>();
        for (Department department : departments) {
            PersistDepartments.add(department);
        }
        emOracle.close();
        for (Department department : PersistDepartments) {
            System.out.println(department.toString());
        }
        
        for (Department department : PersistDepartments) {
            emSqlServer.getTransaction().begin();        
            emSqlServer.persist(department);
            emSqlServer.getTransaction().commit();         
        }        
    }
}
