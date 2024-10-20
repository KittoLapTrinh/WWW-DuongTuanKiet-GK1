package vn.edu.iuh.fit.wwwduongtuankietgk1.services;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Skill;

import java.util.List;

public interface SkillService {
    List<Skill> getAllSkill();

    boolean insert(Skill skill);
}
