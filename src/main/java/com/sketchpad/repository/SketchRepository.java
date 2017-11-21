package com.sketchpad.repository;

import com.sketchpad.domain.Sketch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
public interface SketchRepository extends JpaRepository<Sketch, Long> {
}
