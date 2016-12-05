package com.sketchpad.repository.impl;

import com.sketchpad.domain.Sketch;
import com.sketchpad.repository.SketchRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Perestoronin Daniil
 */
@Repository
public class SketchRepositoryImpl implements SketchRepository {

    private Map<Long,Sketch> sketchMap;

    public SketchRepositoryImpl(){
        sketchMap = new LinkedHashMap<>();
        sketchMap.put(1L,new Sketch().setId(1L)
                .setName("test sketch 1")
                .setText("Test text for test sketch 1"));
        sketchMap.put(2L,new Sketch().setId(2L)
                .setName("test sketch 2")
                .setText("Test text for test sketch 2"));
        sketchMap.put(3L,new Sketch().setId(3L)
                .setName("test sketch 3")
                .setText("Test text for test sketch 3"));
    }


    @Override
    public Collection<Sketch> getAllSketches() {
        return sketchMap.values();
    }

    @Override
    public Sketch getSketchById(Long id) {
        return sketchMap.get(id);
    }

    @Override
    public Sketch createSketch(Sketch sketch) {
        return sketchMap.put(sketch.getId(),sketch);
    }

    @Override
    public void updateSketch(Sketch sketch) {
       sketchMap.put(sketch.getId(),sketch);
    }

    @Override
    public void deleteSketch(Long id) {
        sketchMap.remove(id);
    }
}
