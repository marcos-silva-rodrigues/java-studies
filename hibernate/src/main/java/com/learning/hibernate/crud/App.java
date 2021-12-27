package com.learning.hibernate.crud;

import com.learning.hibernate.model.HibernateSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
//        create(session);
        read(session);
        update(session);
        delete(session);
        session.getTransaction().commit();
    }

    public static void create(Session session) {
        Product product = new Product();

        product.setName("P 1");
        product.setPrice(10.00);

        session.save(product);
    }

    public static void read(Session session) {
        List<Product> productList = session.createQuery("from Product").getResultList();
//        Product p1 = session.find(Product.class, 2);
        System.out.println(productList);
    }

    public static void update(Session session) {
        Product p2 = session.find(Product.class, 2);

        if (p2 != null) {
            p2.setName("Product Edited 1");
            p2.setPrice(20.00);

            session.update(p2);
        }
    }

    public static void delete(Session session) {
        Product p3 = session.find(Product.class, 3);

        if (p3 != null) {
            session.remove(p3);
        }
    }
}
