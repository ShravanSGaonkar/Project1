package Student_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import servletscrud.dto.StudentDto;

public class Student_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    public void create() {
    	entityTransaction.begin();
    	entityManager.persist(dto);
    	entityTransaction.commit();
    }
}
