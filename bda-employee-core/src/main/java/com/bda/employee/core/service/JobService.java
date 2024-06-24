package com.bda.employee.core.service;


import com.bda.employee.core.mapper.JobMapper;
import com.bda.employee.core.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobMapper jobMapper;

    public void add(Job job) {
        jobMapper.insertSelective(job);
    }

    public void delete(Integer jobId) {
        jobMapper.deleteByPrimaryKey(jobId);
    }
}
