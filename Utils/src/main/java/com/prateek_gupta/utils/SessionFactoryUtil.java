package com.prateek_gupta.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    private static SessionFactory factory;

    /**
     * Method to return an object of SessionFactory based on the configuration file named
     * as hibernate.cfg.xml
     * @return an object of SessionFactory
     */
    static public SessionFactory getFactory(){
        if (factory==null){
            Configuration configuration=new Configuration();
            configuration.configure();
            factory=configuration.buildSessionFactory();
        }
        return factory;
    }

    /**
     * Method to return an object of SessionFactory based on the configuration file for the
     * provided name
     * @param configurationFileName is the name of the configuration file
     * @return an object of SessionFactory
     */
    static public SessionFactory getFactory(String configurationFileName){
        if (factory==null){
            Configuration configuration=new Configuration();
            configuration.configure(configurationFileName);
            factory=configuration.buildSessionFactory();
        }
        return factory;
    }

    static public void closeFactory(){
        factory.close();
    }
}
