package com.sencloud.mybatis.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sencloud.mybatis.dataobject.EmployeeDO;
import com.sencloud.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: jason
 * @Description:
 * @Date: Created in 14:59 2019/7/8
 */
@RestController
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public EmployeeDO getById(){
        return employeeService.getEmployeeById();
    }

    @GetMapping("/page")
    public PageInfo<EmployeeDO> findByPage(@RequestParam("page") Integer pageNum, @RequestParam("size") Integer size){

        PageHelper.startPage(pageNum,size);
        List<EmployeeDO> empList = employeeService.findByPage();
        PageInfo<EmployeeDO> pageInfo = new PageInfo(empList);
        return pageInfo;

    }

    @GetMapping("/page/name")
    public PageInfo<EmployeeDO> findByNameForPage(@RequestParam("page") Integer pageNum,
                                                  @RequestParam("size") Integer size,
                                                  @RequestParam("lastName") String lastName){

        PageHelper.startPage(pageNum,size);
        List<EmployeeDO> empList = employeeService.findByNameForPage(lastName);
        PageInfo<EmployeeDO> pageInfo = new PageInfo(empList);
        return pageInfo;

    }

    @PostMapping("/insert")
    public String insert(@RequestBody EmployeeDO employeeDO){
        employeeService.insert(employeeDO);
        return "ok";
    }
}
