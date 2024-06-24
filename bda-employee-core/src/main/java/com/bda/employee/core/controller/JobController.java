package com.bda.employee.core.controller;

import com.bda.common.core.controller.BaseController;
import com.bda.common.core.helper.ResultHelper;
import com.bda.employee.core.model.Employee;
import com.bda.employee.core.model.Job;
import com.bda.employee.core.service.JobService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("job")
public class JobController extends BaseController {

    @Autowired
    private JobService jobService;


    @PostMapping("save")
    public Object addEmployee(@RequestBody @Validated Job job) {
        jobService.add(job);
        return ResultHelper.success();
    }

    @GetMapping("delete")
    public Object deleteEmployee(@RequestParam(value = "jobId", required = true) Integer jobId) {

        jobService.delete(jobId);
        return ResultHelper.success();
    }

}
