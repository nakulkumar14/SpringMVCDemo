package com.springapp.mvc;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by nakulkumar on 2/6/16.
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 5780450207578829993L;

    private String firstname;
    private String lastname;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;

    private Integer empId;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob=" + dob +
                ", empId=" + empId +
                '}';
    }
}
