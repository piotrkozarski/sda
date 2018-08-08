package Users2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public interface SessionOperations {

 /*   Session openCurrentSession();
*/
  //  Session
    void openCurrentSessionWithTransaction();

    void closeCurrentSessionWithTransaction();

  /*  void closeCurrentSession();

    SessionFactory getSessionFactory();

    Transaction getCurrentTransaction();*/
}
