package com.sencloud.mybatis.service;

import com.sencloud.mybatis.dao.DepartmentDOMapper;
import com.sencloud.mybatis.dataobject.DepartmentDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jason
 * @Description:
 * @Date: Created in 16:18 2019/7/9
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentDOMapper departmentDOMapper;

    public DepartmentDO getAllById(Integer id){
      return   departmentDOMapper.findDeptByIdPlus(id);
    }


}
