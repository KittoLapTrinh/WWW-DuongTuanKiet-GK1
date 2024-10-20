package vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.CandidateSkill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.CandidateSkillRepository;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.CandidateSkillService;

import java.util.List;

public class CandidateSkillServiceImpl implements CandidateSkillService {
    private final CandidateSkillRepository repository;

    public CandidateSkillServiceImpl() {
        repository = new CandidateSkillRepository();
    }

    @Override
    public List<CandidateSkill> getAllCandidateSkill() {
        return repository.getAll(CandidateSkill.class);
    }

    @Override
    public boolean insert(CandidateSkill candidateSkill) {
        return repository.insert(candidateSkill);
    }
}
