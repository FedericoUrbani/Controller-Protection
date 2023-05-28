package com.example.LoginController.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double salary;

    @OneToOne(mappedBy = "salary")
    @JsonIgnore
    private UserEntity user;


    public Salary(Double salary) {
        this.salary=salary;
    }
}
