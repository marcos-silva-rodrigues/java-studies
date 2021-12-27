package com.learning.hibernate.model;

import com.learning.hibernate.model.Address;
import com.learning.hibernate.model.HibernateSession;
import com.learning.hibernate.model.Options;
import com.learning.hibernate.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        SessionFactory session = HibernateSession.getSessionFactory();

        User user = new User();
        Address address = new Address();
        List<Options> optionsList = new ArrayList<Options>();

        optionsList.add(new Options("teste"));

        user.setUsername("marcos-silva");
        user.setName("Marcos");
        user.setLastName("Silva");

        address.setStreet("Fulano Street");
        address.setNumber(000);
    }
}
