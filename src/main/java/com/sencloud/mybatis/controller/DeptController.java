package com.sencloud.mybatis.controller;

import com.sencloud.mybatis.dataobject.DepartmentDO;
import com.sencloud.mybatis.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jason
 * @Description:
 * @Date: Created in 16:19 2019/7/9
 */

@RestController
public class DeptController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/dept/findAllById")
    public DepartmentDO getAllById(Integer id){
        return departmentService.getAllById(id);
    }
}
