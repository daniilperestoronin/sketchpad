package com.sketchpad.repository;

import com.sketchpad.domain.Sketch;

import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
public interface SketchRepository {
    Collection<Sketch> getAllSketches();
    Sketch getSketchById(Long id);
    Sketch createSketch(Sketch sketch);
    void updateSketch(Sketch sketch);
    void deleteSketch(Long id);
}
