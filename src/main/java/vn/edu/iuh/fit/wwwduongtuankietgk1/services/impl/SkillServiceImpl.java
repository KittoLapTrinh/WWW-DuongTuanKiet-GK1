package vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Skill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.SkillRepository;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.SkillService;

import java.util.List;

public class SkillServiceImpl implements SkillService {
    private final SkillRepository repository;
    public SkillServiceImpl() {
        repository = new SkillRepository();
    }
    @Override
    public List<Skill> getAllSkill() {
        return repository.getAll(Skill.class);
    }

    @Override
    public boolean insert(Skill skill) {
        return repository.insert(skill);
    }
}
