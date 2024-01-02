package com.example.Shop2.controler;

import com.example.Shop2.dto.EntranceDTO;
import com.example.Shop2.model.Entrance;
import com.example.Shop2.service.EntranceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/entrance")
public class ContrEntrance {

    private EntranceService service;
    @GetMapping
    public List<Entrance> list(){
        return service.listEntrance();
    }

    @PostMapping
    public Entrance add(@RequestBody EntranceDTO dto){
        return service.creat(dto);
    }
}
