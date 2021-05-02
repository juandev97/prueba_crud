package com.example.prueba_crud.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "employee")


public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Salary")
    private long Salary;

    @Column(name = "depto_id")
    private long depto_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public long getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(long depto_id) {
        this.depto_id = depto_id;
    }
}
