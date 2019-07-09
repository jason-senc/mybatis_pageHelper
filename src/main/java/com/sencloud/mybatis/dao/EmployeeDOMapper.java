package com.sencloud.mybatis.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.sencloud.mybatis.dataobject.EmployeeDO;

import java.util.List;

public interface EmployeeDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    int deleteByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    int insert(EmployeeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    int insertSelective(EmployeeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    EmployeeDO selectByPrimaryKey(Integer employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    int updateByPrimaryKeySelective(EmployeeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    int updateByPrimaryKey(EmployeeDO record);

    List<EmployeeDO> findByPage();
}