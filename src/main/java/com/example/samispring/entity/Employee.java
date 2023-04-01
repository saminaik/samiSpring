package com.example.samispring.entity;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Employee")
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int employeeId;
    String  employeeName;
    String employeeCity;
      @OneToOne
      @JoinColumn(name = "fk_spouse")
    private Spouse spouse;
      @OneToMany
      private List<Adress>adresses;
      @ManyToMany

      private List<Project>projects;
    public Employee(int employeeId, String employeeName, String employeeCity) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public Spouse getSpouse() {
        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public List<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }
}
