package vn.edu.iuh.fit.wwwduongtuankietgk1.repositories;

import jakarta.persistence.EntityManager;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Skill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.instance.ConnectDB;

public class SkillRepository extends CRUDRepository<Skill>{
    public SkillRepository() {
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }

}
