package vn.edu.iuh.fit.wwwduongtuankietgk1.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import vn.edu.iuh.fit.wwwduongtuankietgk1.enums.SkillLevel;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Candidate;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.instance.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class CandidateRepository extends CRUDRepository<Candidate>{
    public CandidateRepository() {
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }

    public List<Candidate> findCandidateByLevel(int level){
        List<Candidate> candidates = new ArrayList<>();
        try{
            transaction.begin();
            Query query = entityManager.createNamedQuery("candidate.findCandidateBySkillLevel")
                            .setParameter("skillLevel", SkillLevel.values()[level]);
            candidates = query.getResultList();
            transaction.commit();

        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return  candidates;
    }

    public List<Candidate> findCandidateHasEmail(){
        List<Candidate> candidates = new ArrayList<>();
        try{
            transaction.begin();
            Query query = entityManager.createNamedQuery("candidate.findCandidateHasEmail");
            candidates = query.getResultList();
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return candidates;
    }

}
