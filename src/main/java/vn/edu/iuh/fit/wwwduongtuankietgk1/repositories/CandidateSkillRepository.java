package vn.edu.iuh.fit.wwwduongtuankietgk1.repositories;

import jakarta.persistence.EntityManager;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.CandidateSkill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.instance.ConnectDB;

public class CandidateSkillRepository extends CRUDRepository<CandidateSkill> {
    public CandidateSkillRepository() {
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }
}
