package com.home.sanxiu.house.dao.repository;

import com.home.sanxiu.house.dao.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  HouseRepository extends JpaRepository<House, Long> {
}
