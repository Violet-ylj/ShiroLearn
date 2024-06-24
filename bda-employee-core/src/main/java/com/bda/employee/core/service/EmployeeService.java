package com.bda.employee.core.service;


import com.bda.employee.core.mapper.EmployeeMapper;
import com.bda.employee.core.model.Employee;
import com.bda.employee.core.vo.EmployeeJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    // 新增或更新员工信息
    public void addEmployee(Employee employee) {
        employeeMapper.insertSelective(employee);
        //employeeMapper.addEmployee(employee);
    }

    // 查询单个员工信息
    public Employee getEmployeeInformation(Integer employeeId) {
        return employeeMapper.selectByPrimaryKey(employeeId);
        //return employeeMapper.getNameById(employeeId);
    }

    // 删除指定员工
    public void deleteEmployee(Integer employeeId) {
        employeeMapper.deleteByPrimaryKey(employeeId);
        //employeeMapper.deleteEmployee(employeeId);
    }


    public EmployeeJob getResult(Integer employeeId) {
        EmployeeJob end = employeeMapper.getResult(employeeId);
        return end;
    }
}
