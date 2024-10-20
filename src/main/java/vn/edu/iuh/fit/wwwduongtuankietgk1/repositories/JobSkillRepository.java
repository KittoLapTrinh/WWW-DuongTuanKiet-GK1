package vn.edu.iuh.fit.wwwduongtuankietgk1.repositories;

import jakarta.persistence.EntityManager;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.JobSkill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.instance.ConnectDB;

public class JobSkillRepository extends CRUDRepository<JobSkill>{
    public JobSkillRepository() {
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }
}
