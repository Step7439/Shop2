package com.example.Shop2.service;

import com.example.Shop2.dto.EntranceDTO;
import com.example.Shop2.model.Entrance;
import com.example.Shop2.repo.EntranceRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntranceService {

    private EntranceRepo repo;

    public List<Entrance> listEntrance() {
        return repo.findAll();
    }

    public Entrance creat(EntranceDTO dto) {
        Entrance entrance = new Entrance();
        entrance.setNameProduct(dto.getNameProduct());
        entrance.setCount(dto.getCount());
        entrance.setWarehouse(dto.getWarehouse());
        return repo.save(entrance);
    }
}
