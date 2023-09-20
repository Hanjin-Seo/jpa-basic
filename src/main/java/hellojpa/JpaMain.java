package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // META-INF/persistence.xml의 persistence-unit의 name="hello"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            /*
                1. INSERT
             */
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("HelloA");
//            em.persist(member);

            /*
                2. SELECT
             */

//            Member findMember = em.find(Member.class, 1L);
//            System.out.println(findMember.getId());
//            System.out.println(findMember.getName());

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(5)
//                    .setMaxResults(8)
//                    .getResultList();

            /*
                3. UPDATE
             */
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

            /*
                비영속
             */
//            Member member = new Member();
//            member.setId(100L);
//            member.setName("HelloJPA");

            /*
                영속
             */

            Member member = em.find(Member.class, 150L);
            member.setName("AAAA");

            /*
                준영속
             */
            em.detach(member);


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
