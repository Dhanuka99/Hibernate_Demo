package lk.ijse.hibernate;

import entity.Student;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.omg.CORBA.UserException;
import util.FactoryConfiguration;

public class Appinitializer {

    public static void main(String[] args){
        Student student = new Student();
        student.setId("S001");
        student.setName("Dhanuka");
        student.setAddress("Kurunegala");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();
        session.close();
    }


}
