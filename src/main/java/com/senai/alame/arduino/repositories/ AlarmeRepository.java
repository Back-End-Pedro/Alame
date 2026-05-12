package com.senai.alame.arduino.repositories;

import com.senai.alame.arduino.models.Alarme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmeRepository
        extends JpaRepository<Alarme, Long> {
}