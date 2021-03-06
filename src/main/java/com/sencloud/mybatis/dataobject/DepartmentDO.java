package com.sencloud.mybatis.dataobject;

import java.util.List;

public class DepartmentDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.department_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.department_name
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    private String departmentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.manager_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    private Integer managerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departments.location_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    private Integer locationId;


    /**
     * 员工信息
     */
    private List<EmployeeDO> employeeDOList;


    public List<EmployeeDO> getEmployeeDOList() {
        return employeeDOList;
    }

    public void setEmployeeDOList(List<EmployeeDO> employeeDOList) {
        this.employeeDOList = employeeDOList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.department_id
     *
     * @return the value of departments.department_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.department_id
     *
     * @param departmentId the value for departments.department_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.department_name
     *
     * @return the value of departments.department_name
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.department_name
     *
     * @param departmentName the value for departments.department_name
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.manager_id
     *
     * @return the value of departments.manager_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.manager_id
     *
     * @param managerId the value for departments.manager_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departments.location_id
     *
     * @return the value of departments.location_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departments.location_id
     *
     * @param locationId the value for departments.location_id
     *
     * @mbg.generated Tue Jul 09 14:52:57 CST 2019
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}