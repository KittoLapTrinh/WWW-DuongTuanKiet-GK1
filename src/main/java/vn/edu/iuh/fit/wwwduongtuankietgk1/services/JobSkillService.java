package vn.edu.iuh.fit.wwwduongtuankietgk1.services;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.JobSkill;

import java.util.List;

public interface JobSkillService {
    List<JobSkill> getAllJobSkill();

    boolean insert(JobSkill jobSkill);
}
