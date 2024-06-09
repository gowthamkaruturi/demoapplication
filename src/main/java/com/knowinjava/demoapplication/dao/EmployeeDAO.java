package com.knowinjava.demoapplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.knowinjava.demoapplication.models.Employee;

@Repository
public class EmployeeDAO {
  @Autowired
  JdbcTemplate jdbcTemplate;

  public List<Employee> getAllEmployees(){
    String sql = "select * from employee";
    return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
    
  }

  public Employee getEmployeeDetails(int id){
    String sql = "select * from employee where employee id = ?";
    return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class), new Object[]{id});
  }
  

  public int insertEmployee(Employee employee){
    String sql = "INSERT INTO EMPLOYEE(ID, NAME, DEPARTMENT, ROLE) values(?,?,?,?)";
    return jdbcTemplate.update(sql, new Object[] {employee.getId(), employee.getName(), employee.getDepartment(), employee.getRole()});
  }
  /*TODO:
  implement delete a record 
  update a record of existing one 
    `change any available record`
  */
}
