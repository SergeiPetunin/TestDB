/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author pupil
 */
@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private int day;
    private int month;
    private int year;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private GroupName groupName;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" 
                + "id=" + id 
                + ", firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", day=" + day 
                + ", month=" + month 
                + ", year=" + year 
                + ", groupName=" + groupName 
                + '}';
    }


    public GroupName getGroupName() {
        return groupName;
    }

    public void setGroupName(GroupName groupName) {
        this.groupName = groupName;
    }
    
}
