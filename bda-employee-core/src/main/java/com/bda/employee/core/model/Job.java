package com.bda.employee.core.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;




@Table(name = Job.TABLE_NAME)
public class Job {

    public static final  String TABLE_NAME = "jobs";

    @Id
    private Integer jobId;

    @Column(name="job_title")
    private String jobTitle;

    public Integer getJobId() {return jobId;}
    public void setJobId(Integer jobId) {this.jobId = jobId;}

    public String getJobTitle() {return jobTitle;}
    public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle;}
}
