package com.home.sanxiu.house.dao.repository;

import com.home.sanxiu.house.dao.entity.House;
import com.home.sanxiu.house.dao.entity.HouseScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseScoreRepository extends JpaRepository<HouseScore, Long> {
}
