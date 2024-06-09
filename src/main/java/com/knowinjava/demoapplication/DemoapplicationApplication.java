package com.knowinjava.demoapplication;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.knowinjava.demoapplication.dao.EmployeeDAO;
import com.knowinjava.demoapplication.models.Employee;

@SpringBootApplication
public class DemoapplicationApplication implements CommandLineRunner{

  @Autowired
  EmployeeDAO employeeDAO;
	public static void main(String[] args) {
		SpringApplication.run(DemoapplicationApplication.class, args);
    
	}

  @Override
  public void run(String ...args) throws Exception{
   
    int insertEffectedRows = employeeDAO.insertEmployee(new Employee(6, "ramesh tendulkar", 1, "player of the team"));
    System.out.println(
      insertEffectedRows >0 ? "successfully inserted ": "failed to insert records"
    
    );
    ArrayList<Employee> employees = (ArrayList<Employee>) employeeDAO.getAllEmployees();
    for(Employee e : employees){
      System.out.println(e.toString());
    }

  }

}
