package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import modal.Product;

public class ProductDao {
	public static void saveProduct(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           
            transaction = session.beginTransaction();
            session.persist(product);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	
	public static List<Product> productList() {
		List<Product> list=new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            Product p=new Product();
            Query<Product> query=session.createQuery("from Product");
            list=query.list();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		return list;
    }
}
