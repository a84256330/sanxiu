package com.home.sanxiu.house.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "house_score")
public class HouseScore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long houseId;
}
