package com.coursework.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "producers")
public class Producer implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String phoneNumber;

    private String country;
}