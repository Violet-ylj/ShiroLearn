package com.bda.employee.core.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Table(name = Employee.TABLE_NAME)
public class Employee {


    public static final  String TABLE_NAME = "EMPLOYEES";

    @Id
    private Integer employeeId;

  //  @NotBlank(message = "名称不能为空")
    @Column(name="first_name") // 该数据的真实字段名
    private String name; // 为空会抛出异常

    @Column(name="gender")
    private String gender;

    @Column(name = "job_id")
    private Integer jobId;


    public void setEmployeeId(Integer employeeId) {this.employeeId = employeeId;}

    public void setName(String name) {this.name = name;}
    public void setGender(String employeeGender) {this.gender = employeeGender;}
    public void setJobId(Integer jobId) {this.jobId = jobId;}


    public Integer getEmployeeId() {
        return employeeId;
    }


    public String getName(){
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getJobId() {
        return jobId;
    }
}
