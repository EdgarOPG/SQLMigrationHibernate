/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.uach.sqlmigrationhibernate.querys;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.uach.sqlmigrationhibernate.entidades.Country;
import mx.com.uach.sqlmigrationhibernate.entidades.Department;
import mx.com.uach.sqlmigrationhibernate.entidades.Employee;
import mx.com.uach.sqlmigrationhibernate.entidades.Job;
import mx.com.uach.sqlmigrationhibernate.entidades.Location;
import mx.com.uach.sqlmigrationhibernate.entidades.Region;

/**
 *
 * @author eopg9
 */
public class PersistenceQueries {

    public void persist() {
    //  Creacion del EntityManager Oracle
        EntityManagerFactory emfOracle = Persistence.createEntityManagerFactory("oraclePU");
        EntityManager emOracle = emfOracle.createEntityManager();
        
    //  Creacion del EntityManager Oracle
        EntityManagerFactory emfSqlServer = Persistence.createEntityManagerFactory("sqlServerPU");
        EntityManager emSqlServer = emfSqlServer.createEntityManager();

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
            //  Operacion SELECT *
        emOracle = emfOracle.createEntityManager();
        Query queryJobs = emOracle.createNamedQuery("Job.findAll");
        List<Job> jobs = queryJobs.getResultList();
        List<Job> PersistJobs = new ArrayList<>();
        for (Job employee : jobs) {
            PersistJobs.add(employee);
        }
        emOracle.close();
        for (Job employee : PersistJobs) {
            System.out.println(employee.toString());
        }
        
        for (Job job : PersistJobs) {
            emSqlServer.getTransaction().begin();        
            emSqlServer.persist(job);
            emSqlServer.getTransaction().commit();         
        }     
            //  Operacion SELECT *
        emOracle = emfOracle.createEntityManager();
        Query queryEmployees = emOracle.createNamedQuery("Employee.findAll");
        List<Employee> employees = queryEmployees.getResultList();
        List<Employee> PersistEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            PersistEmployees.add(employee);
        }
        emOracle.close();
        for (Employee employee : PersistEmployees) {
            System.out.println(employee.toString());
        }
        
        for (Employee employee : PersistEmployees) {
            emSqlServer.getTransaction().begin();        
            emSqlServer.persist(employee);
            emSqlServer.getTransaction().commit();         
        }             
        
    }            
}
