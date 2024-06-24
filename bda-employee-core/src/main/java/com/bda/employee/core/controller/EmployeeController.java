package com.bda.employee.core.controller;

import com.bda.employee.core.model.Employee;
import com.bda.employee.core.service.EmployeeService;
import com.bda.employee.core.vo.EmployeeJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.bda.common.core.controller.BaseController;
import com.bda.common.core.helper.ResultHelper;


/**
 *  对员工表的处理
 * @author heshuyuan
 *
 */
@RestController
@RequestMapping("employee")
public class EmployeeController extends BaseController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * 查询员工信息
	 * @return
	 */

	@GetMapping("getname")
	public Object getname(@RequestParam(value = "employeeId", required = true) Integer employeeId) {

		Employee result = employeeService.getEmployeeInformation(employeeId);
		return ResultHelper.success(result);
	}

	/**
	 * 联合查询员工信息
	 */
	@GetMapping("getinfo")
	public Object getinfo(@RequestParam(value = "employeeId", required = true) Integer employeeId) {

		EmployeeJob end = employeeService.getResult(employeeId);
		return ResultHelper.success(end);
	}

	/**
	 * 增加或更新员工信息
	 */
	@PostMapping("save")
	public Object addEmployee(@RequestBody @Validated Employee employee) {
		employeeService.addEmployee(employee);
		return ResultHelper.success();
	}

	/**
	 * 删除员工
	 */
	@GetMapping("delete")
	public Object deleteEmployee(@RequestParam(value = "employeeId", required = true) Integer employeeId) {

		employeeService.deleteEmployee(employeeId);
		return ResultHelper.success();
	}

}
