package com.example.samispring.service;

import com.example.samispring.entity.Employee;
import com.example.samispring.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeelist= new ArrayList<>(Arrays.asList(
            new Employee(1,"sami","banglore"),
            new Employee(2,"naik","banglore")

    ));
    @Autowired
    EmpRepository empRepository;
    public List<Employee> getEmployee(){
       // return employeelist;
        return empRepository.findAll();
    }

    public Employee getAnEmloyee(int id){
//        return employeelist.stream().filter(e->(
//                e.getEmployeeId()==id)).findFirst().get();
        return empRepository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
    }
    public void createEmployee(Employee employee)
    {
        //employeelist.add(employee);
        empRepository.save(employee);
    }
    public void updateEmployee(Employee employee){
//        List<Employee> tempEmployee = new ArrayList<>();
//        for(Employee emp:employeelist){
//            if(emp.getEmployeeId()==employee.getEmployeeId())
//            { emp.setEmployeeName(employee.getEmployeeName());
//              emp.setEmployeeCity(employee.getEmployeeCity());
//
//            }
//         tempEmployee.add(emp);
//        }
//        this.employeelist=tempEmployee;

        empRepository.save(employee);
    }
    public void deleteEmployee(int id){
//        List<Employee> tempEmployee = new ArrayList<>();
//        for(Employee emp:employeelist){
//            if(emp.getEmployeeId()==id)
//                continue;
//            tempEmployee.add(emp);
//        }
//        this.employeelist=tempEmployee;
      empRepository.delete(empRepository.getById(id));
    }
}
