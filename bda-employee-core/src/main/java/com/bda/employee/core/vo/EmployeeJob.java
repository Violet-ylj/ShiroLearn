package com.bda.employee.core.vo;


public class EmployeeJob {


    private String firstName; // 为空会抛出异常


    private String gender;


    private String jobTitle;


    public void setName(String name) {this.firstName = name;}
    public void setGender(String employeeGender) {this.gender = employeeGender;}

    public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle;}


    public String getJobTitle(){
        return jobTitle;
    }

    public String getName(){
        return firstName;
    }

    public String getGender() {
        return gender;
    }


}
