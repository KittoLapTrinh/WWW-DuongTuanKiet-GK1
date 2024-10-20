package vn.edu.iuh.fit.wwwduongtuankietgk1.services;

import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Job;

import java.util.List;

public interface JobService {
    List<Job> getAllJob();

    boolean insert(Job job);
}
