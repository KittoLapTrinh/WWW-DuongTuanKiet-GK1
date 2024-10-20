package vn.edu.iuh.fit.wwwduongtuankietgk1.repositories;

import jakarta.persistence.EntityManager;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Job;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.instance.ConnectDB;

import java.util.List;

public class JobRepository extends CRUDRepository<Job>{
    public JobRepository() {
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }


}
