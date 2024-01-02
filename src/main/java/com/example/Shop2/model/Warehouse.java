package com.example.Shop2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "warehouse")
    private String warehouse;
    @ManyToOne
    @JoinColumn(name = "entrance_id", referencedColumnName = "id")
    @JsonIgnore
    private Entrance entrance;

}
