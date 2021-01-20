package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){

    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;

    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
