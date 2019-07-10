package com.sencloud.mybatis.dataobject;

import java.io.Serializable;
import java.util.Date;

public class EmployeeDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.employee_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private Integer employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.first_name
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.last_name
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.email
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.phone_number
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.job_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private String jobId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.salary
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private Double salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.commission_pct
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private Double commissionPct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.manager_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private Integer managerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.department_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.hiredate
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    private Date hiredate;

    /**
     * 部门
     */
    private DepartmentDO departmentDO;


    public DepartmentDO getDepartmentDO() {
        return departmentDO;
    }

    public void setDepartmentDO(DepartmentDO departmentDO) {
        this.departmentDO = departmentDO;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.employee_id
     *
     * @return the value of employees.employee_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.employee_id
     *
     * @param employeeId the value for employees.employee_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.first_name
     *
     * @return the value of employees.first_name
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.first_name
     *
     * @param firstName the value for employees.first_name
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.last_name
     *
     * @return the value of employees.last_name
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.last_name
     *
     * @param lastName the value for employees.last_name
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.email
     *
     * @return the value of employees.email
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.email
     *
     * @param email the value for employees.email
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.phone_number
     *
     * @return the value of employees.phone_number
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.phone_number
     *
     * @param phoneNumber the value for employees.phone_number
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.job_id
     *
     * @return the value of employees.job_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.job_id
     *
     * @param jobId the value for employees.job_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.salary
     *
     * @return the value of employees.salary
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.salary
     *
     * @param salary the value for employees.salary
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.commission_pct
     *
     * @return the value of employees.commission_pct
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public Double getCommissionPct() {
        return commissionPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.commission_pct
     *
     * @param commissionPct the value for employees.commission_pct
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.manager_id
     *
     * @return the value of employees.manager_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.manager_id
     *
     * @param managerId the value for employees.manager_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.department_id
     *
     * @return the value of employees.department_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.department_id
     *
     * @param departmentId the value for employees.department_id
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.hiredate
     *
     * @return the value of employees.hiredate
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.hiredate
     *
     * @param hiredate the value for employees.hiredate
     *
     * @mbg.generated Mon Jul 08 14:48:43 CST 2019
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}