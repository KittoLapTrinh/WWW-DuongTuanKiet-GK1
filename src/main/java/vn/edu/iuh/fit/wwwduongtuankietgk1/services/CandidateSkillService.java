package vn.edu.iuh.fit.wwwduongtuankietgk1.services;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.CandidateSkill;

import java.util.List;

public interface CandidateSkillService {
    List<CandidateSkill> getAllCandidateSkill();

    boolean insert(CandidateSkill candidateSkill);
}
