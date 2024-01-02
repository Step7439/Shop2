package com.example.Shop2.repo;

import com.example.Shop2.model.Entrance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntranceRepo extends JpaRepository<Entrance, Long> {
}
