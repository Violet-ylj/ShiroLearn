package com.bda.employee.core.mapper;

import com.bda.employee.core.model.Employee;


import com.bda.employee.core.vo.EmployeeJob;
import tk.mybatis.mapper.common.Mapper;

/**
 * 员工表接口,如果入参非 复杂参数类型，必须声明 key
 * @org.apache.ibatis.annotations.Param 可以声明入参的key
 * 如下面例子中的 @Param("id") String id ，只有 加了 @Param("id") ，在 对应的xml 里面才能使用该变量
 * @author heshuyuan
 *
 */

public interface EmployeeMapper extends Mapper<Employee>{

	/**
	 * 这是一个 拓展的sql
	 */

	Employee getNameById(int id);

	void deleteEmployee(Integer employeeId);

	void addEmployee(Employee employee);

	EmployeeJob getResult(Integer employeeId);
}
