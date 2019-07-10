package com.sencloud.mybatis.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sencloud.mybatis.dao.EmployeeDOMapper;
import com.sencloud.mybatis.dataobject.EmployeeDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: jason
 * @Description:
 * @Date: Created in 14:54 2019/7/8
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDOMapper employeeDOMapper;

    public EmployeeDO getEmployeeById(){
        return employeeDOMapper.selectByPrimaryKey(100);
    }

    public List<EmployeeDO> findByPage(){
        return  employeeDOMapper.findByPage();
    }

    public List<EmployeeDO> findByNameForPage(String firstName){
        return  employeeDOMapper.findByNameForPage(firstName);
    }

    public EmployeeDO findEmpAndDept(Integer id ){
        return employeeDOMapper.findEmpAndDept(id);
    }

    public void insert(EmployeeDO employeeDO){
        employeeDOMapper.insertSelective(employeeDO);
    }

    public List<EmployeeDO>getEmpByIds(List ids){
        return employeeDOMapper.getEmpByIds(ids);
    }

    public void addEmps(List<EmployeeDO> employeeDOList){
        employeeDOMapper.addEmps(employeeDOList);
    }

    public void delEmps(List<Integer> ids){
        employeeDOMapper.deleteEmps(ids);
    }

}
