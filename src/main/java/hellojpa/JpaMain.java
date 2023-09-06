package hellojpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        // META-INF/persistence.xml의 persistence-unit의 name="hello"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        
    }
}
