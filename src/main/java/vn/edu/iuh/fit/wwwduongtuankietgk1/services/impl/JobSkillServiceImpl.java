package vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.JobSkill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.JobRepository;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.JobSkillRepository;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.JobSkillService;

import java.util.List;

public class JobSkillServiceImpl implements JobSkillService{
    private final JobSkillRepository repository;

    public JobSkillServiceImpl() {
        repository = new JobSkillRepository();
    }


    @Override
    public List<JobSkill> getAllJobSkill() {
        return repository.getAll(JobSkill.class);
    }

    @Override
    public boolean insert(JobSkill jobSkill) {
        return repository.insert(jobSkill);
    }
}
