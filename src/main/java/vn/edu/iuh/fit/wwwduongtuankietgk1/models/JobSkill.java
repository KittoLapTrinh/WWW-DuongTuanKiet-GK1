package vn.edu.iuh.fit.wwwduongtuankietgk1.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.wwwduongtuankietgk1.enums.SkillLevel;

@Entity
@Table(name = "jobSkill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Enumerated(EnumType.STRING)
    private SkillLevel requiredSkillLevel;

    @Override
    public String toString() {
        return "JobSkill{" +
                "skill=" + skill +
                ", job=" + job +
                ", requiredSkillLevel=" + requiredSkillLevel +
                '}';
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setRequiredSkillLevel(SkillLevel requiredSkillLevel) {
        this.requiredSkillLevel = requiredSkillLevel;
    }

    public Skill getSkill() {
        return skill;
    }

    public Job getJob() {
        return job;
    }

    public SkillLevel getRequiredSkillLevel() {
        return requiredSkillLevel;
    }

    public JobSkill(Skill skill, Job job, SkillLevel requiredSkillLevel) {
        this.skill = skill;
        this.job = job;
        this.requiredSkillLevel = requiredSkillLevel;
    }

    public JobSkill() {
    }
}
