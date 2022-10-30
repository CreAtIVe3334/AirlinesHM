package com.example.repository.inter;

import com.example.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightInter extends JpaRepository<Flight,Integer> {
}
