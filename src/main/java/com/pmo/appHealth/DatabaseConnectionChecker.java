package com.pmo.appHealth;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseConnectionChecker {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean isDatabaseConnected() {
        try {
            Query query = entityManager.createNativeQuery("SELECT 1 from dual");
            query.getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
