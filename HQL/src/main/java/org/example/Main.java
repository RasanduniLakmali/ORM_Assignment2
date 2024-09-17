package org.example;

import org.example.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

               //INSERT

        Query query = session.createQuery("insert into Student (sId,name,address) values(?1,?2,?3)");
        query.setParameter(1,2);
        query.setParameter(2,"Kandy");
        query.setParameter(3,"Dulan");
        query.executeUpdate();

              //UPDATE

          /*Query query1 = session.createQuery("update Student set name = ?1 where sId = ?2");
          query1.setParameter(1,"dulan");
          query1.setParameter(2,3);
          query1.executeUpdate();*/


             //DELETE

          /*Query query2 = session.createQuery("delete from Student where sId =?1");
          query2.setParameter(1,2);
          query2.executeUpdate();*/


             //SELECT COLUMN BY WHERE CLAUSE

          /*Query query3 = session.createQuery("select sId,name from Student where sId=?1");
          query3.setParameter(1,"1");
          List<Object[]> objectList = query3.list();

           for (Object[] student : objectList){

            System.out.println("ID : " + student[0]);
            System.out.println("Name : " + student[1]);
          }*/


              //SELECT TWO COLUMNS

          /*Query query4 = session.createQuery("select sId,name from Student");
          List<Object[]> objects = query4.list();

           for (Object[] students : objects){

            System.out.println("ID :" + students[0]);
            System.out.println("Name :" + students[1]);

           }*/

              //JOINQUERY

           /*Query query5 = session.createQuery("select w.wId,w.type from Watch w inner join Student s on w.wId = s.sId");
           List<Object[]> result1 = query5.list();

            for (Object[] student1 : result1){
              System.out.println(student1[0] + "" +student1[1]);
            }*/


          transaction.commit();
          session.close();
    }
}