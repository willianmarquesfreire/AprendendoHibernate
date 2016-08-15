/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.JpaPuro;

import com.zaxxer.hikari.HikariConfig;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sql.DataSource;



/**
 *
 * @author wmfsystem
 */
public final class JpaUtil {

    private static final String PERSISTENCE_UNIT = "jpaspyke";

    private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<>();

    private static EntityManagerFactory entityManagerFactory;

    private JpaUtil() {

    }

    public static EntityManager getEntityManager() {
        
//        HikariConfig properties = new HikariConfig();
//        properties.setPoolName(PERSISTENCE_UNIT);
//        properties.setTransactionIsolation("RESOURCE_LOCAL");
//        properties.setPassword("root");
//        properties.setUsername("root");
//        properties.setMaximumPoolSize(20);
//        properties.setIdleTimeout(30000L);
//        properties.setInitializationFailFast(true);
//        properties.addDataSourceProperty("javax.persistence.provider", "org.hibernate.ejb.HibernatePersistence");
//        properties.addDataSourceProperty("javax.persistence.transactionType", "RESOURCE_LOCAL");
//        properties.addDataSourceProperty("hibernate.connection.username", "root");
//        properties.addDataSourceProperty("hibernate.connection.password", "root");
//        properties.addDataSourceProperty("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver");
//        properties.addDataSourceProperty("hibernate.connection.url", "jdbc:hsqldb:.");
//        properties.addDataSourceProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
//        properties.addDataSourceProperty("hibernate.hbm2ddl.auto", "create-drop");
//        properties.addDataSourceProperty("hibernate.show_sql", "true");
//        properties.addDataSourceProperty("hibernate.format_sql", "true");

        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        EntityManager entityManager = threadEntityManager.get();
        
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = entityManagerFactory.createEntityManager();
            JpaUtil.threadEntityManager.set(entityManager);
        }

        return entityManager;
    }

    public static void closeEntityManager() {

        EntityManager em = threadEntityManager.get();

        if (em != null) {
            EntityTransaction transaction = em.getTransaction();

            if (transaction.isActive()) {
                transaction.commit();
            }

            em.close();

            threadEntityManager.set(null);
        }
    }

    public static void closeEntityManagerFactory() {
        closeEntityManager();
        entityManagerFactory.close();
    }
}
