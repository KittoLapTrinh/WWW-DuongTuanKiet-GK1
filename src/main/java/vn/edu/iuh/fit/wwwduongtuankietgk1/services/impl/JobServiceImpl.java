package vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Job;
import vn.edu.iuh.fit.wwwduongtuankietgk1.repositories.JobRepository;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.JobService;

import java.util.List;

public class JobServiceImpl implements JobService {
    private final JobRepository repository;

    public JobServiceImpl() {
        repository = new JobRepository();
    }

    @Override
    public List<Job> getAllJob() {
        return repository.getAll(Job.class);
    }

    @Override
    public boolean insert(Job job) {
        return repository.insert(job);
    }
}
