package com.example.Shop2.dto;

import com.example.Shop2.model.Warehouse;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class EntranceDTO {
    private String nameProduct;
    private long count;
    private List<Warehouse> warehouse;
}
