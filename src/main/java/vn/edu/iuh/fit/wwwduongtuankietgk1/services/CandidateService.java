package vn.edu.iuh.fit.wwwduongtuankietgk1.services;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAllCandidate();
    Candidate getCandidateDetail(long id) throws Exception;
    boolean insert(Candidate candidate);
    List<Candidate> findCandidateBySkillLevel(int skillLevel);
    List<Candidate> findCandidateHasEmail();
}
