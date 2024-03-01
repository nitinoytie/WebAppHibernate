package dao;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import bean.User;
import modal.Product;

public class HibernateUtil {
	 private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	        	 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	        	  
	        	 sessionFactory = meta.getSessionFactoryBuilder().build();  
	        }
	        return sessionFactory;
	    }

}
