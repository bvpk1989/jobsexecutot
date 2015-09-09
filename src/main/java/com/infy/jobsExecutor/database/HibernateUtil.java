package com.infy.jobsExecutor.database;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import com.infy.jobsExecutor.model.JobsExecutorEntity;
public class HibernateUtil {

	/* creating Hibernate session factory */
private static final SessionFactory sessionFactory;
    static {
        try {
        	Configuration cfg=new Configuration()
        	.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/jobsExecutor_db")
			.setProperty("hibernate.connection.username", "root")
			.setProperty("hibernate.connection.password", "root")
			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLInnoDBDialect")
			.setProperty("hibernate.show_sql","true")
			.addPackage("com.infy.jobsExecutor.model")
			.addAnnotatedClass(JobsExecutorEntity.class);
            ServiceRegistry serviceregistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
            sessionFactory = cfg.buildSessionFactory(serviceregistry);
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }
    /* creating Hibernate Session  */
    public static Session getSession()
            throws HibernateException {
        return sessionFactory.openSession();
    }
}
            