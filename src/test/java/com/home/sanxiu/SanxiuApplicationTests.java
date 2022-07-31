package com.home.sanxiu;

import com.home.sanxiu.house.dao.entity.House;
import com.home.sanxiu.house.dao.repository.HouseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SanxiuApplicationTests {
    @Autowired
    private HouseRepository houseRepository;

    @Test
    void contextLoads() {
        Optional<House> byId = houseRepository.findById(1L);
        System.out.println(byId.get());
    }

}
