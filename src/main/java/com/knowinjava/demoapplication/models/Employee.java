package com.knowinjava.demoapplication.models;

public class Employee {
  private int id;
  private String name;
  private int department;
  private String role;
  public Employee(){

  }
  public Employee(int id, String name, int department, String role) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.role = role;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getDepartment() {
    return department;
  }
  public void setDepartment(int department) {
    this.department = department;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

@Override
public String toString(){
  return "i am " + this.name +" working for" +department;
  
}
}
