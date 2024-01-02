package com.example.Shop2.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Entity
@Data
@RequiredArgsConstructor
public class Entrance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameProduct")
    private String nameProduct;
    @Column(name = "count")
    private long count;
    @OneToMany(mappedBy = "entrance", cascade = CascadeType.ALL) //, cascade = CascadeType.ALL
    private List<Warehouse> warehouse ;

}
