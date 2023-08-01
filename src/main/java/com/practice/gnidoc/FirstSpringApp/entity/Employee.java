package com.practice.gnidoc.FirstSpringApp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @JsonProperty(value = "employee_id")
    private int employeeID;
    @Column(name = "name")
    @JsonProperty(value = "name")
    private String name;

    @Column(name = "company_name")
    @JsonProperty(value = "company_name")
    private String companyName;
    @Column(name = "job_location_name")
    @JsonProperty(value = "job_location_name")
    private String jobLocationName;

    public Employee() {}
    public Employee(int employeeID, String name, String companyName, String jobLocationName) {
        this.employeeID = employeeID;
        this.name = name;
        this.companyName = companyName;
        this.jobLocationName = jobLocationName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobLocationName() {
        return jobLocationName;
    }

    public void setJobLocationName(String jobLocationName) {
        this.jobLocationName = jobLocationName;
    }
}
