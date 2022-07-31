package com.home.sanxiu.house.dao.entity;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
