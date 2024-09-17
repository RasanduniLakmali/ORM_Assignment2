package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.example.entity.Watch;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

              //SELECT

        /*NativeQuery query1 = session.createNativeQuery("select * from Student");
        query1.addEntity(Student.class);
        List<Student> studentList = query1.list();

        for (Student student : studentList){

            System.out.println(student);
        }*/

             //INSERT

        NativeQuery query = session.createNativeQuery("insert into Student(sId,name,address) values(?1,?2,?3)");
        query.setParameter(1,"3");
        query.setParameter(2,"Dilani");
        query.setParameter(3,"Galle");
        query.executeUpdate();


            //UPDATE

         /*NativeQuery query2 = session.createNativeQuery("update Student set name = ?1 where sId = ?2");
         query2.setParameter(1,"Sadun");
         query2.setParameter(2,3);
         query2.executeUpdate();*/


            //DELETE

         /*NativeQuery query3 = session.createNativeQuery("delete from Student where sId =?1");
          query3.setParameter(1,2);
          query3.executeUpdate();*/


           //SEARCH BY NAME

         /*NativeQuery query4 = session.createNativeQuery("select * from Student where name = ?1");
         query4.addEntity(Student.class);
         query4.setParameter(1,"Dilani");
         Student student = (Student) query4.uniqueResult();
         System.out.println(student);*/


        transaction.commit();
        session.close();
    }
}