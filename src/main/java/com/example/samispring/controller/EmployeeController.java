package com.example.samispring.controller;

import com.example.samispring.entity.Employee;
import com.example.samispring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/employee")

  public List<Employee> findAllEmployee(){

        return employeeService.getEmployee();
  }
  @RequestMapping("/employee/{id}")
    public Employee findAnEmployee(@PathVariable int id){
        return employeeService.getAnEmloyee(id);
  }
  @RequestMapping(value = "employee",method = RequestMethod.POST)
  public void createEmployee(@RequestBody Employee employee)
  {
      employeeService.createEmployee(employee);
  }
  @RequestMapping(value = "/employee/{id}",method = RequestMethod.PUT)
  public void employeeUpadate(@PathVariable int id,@RequestBody Employee employee)
  {
     employeeService.updateEmployee(employee);
  }
  @RequestMapping(value = "/employee/{id}",method =RequestMethod.DELETE)
    public List<Employee> deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return employeeService.getEmployee();
  }
}
