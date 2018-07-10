package com.jibin.dao;
import com.jibin.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    /**
     * 查询所有雇员信息。
     * @return 查询结果封装的List集合。
     */
    public List<Employee> findEmployee();

    /**
     * 根据id查询雇员。
     * @param id 雇员编号。
     * @return 该编号对应的雇员对象。
     */
    public Employee findEmployeeById(Integer id);

    /**
     * 根据id删除雇员信息。
     * @param id 要删除的雇员id。
     * @return 被删除的雇员id。
     */
    public Integer deleteEmployeeById(Integer id);

    /**
     * 插入雇员信息。
     * @param employee 封装了要插入雇员信息的雇员对象。
     * @return true：插入成功；false：插入失败。
     */
    public boolean insertEmployee(Employee employee);
}
