package com.sketchpad.services.impl;

import com.sketchpad.domain.Sketch;
import com.sketchpad.repository.SketchRepository;
import com.sketchpad.services.SketchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
@Service
public class SketchServiceImpl implements SketchService{

    @Autowired
    SketchRepository sketchRepository;

    @Override
    public Collection<Sketch> getAllSketches() {
        return sketchRepository.findAll();
    }

    @Override
    public Sketch getSketchById(Long id) {
        return sketchRepository.getOne(id);
    }

    @Override
    public Sketch createSketch(Sketch sketch) {
        return sketchRepository.save(sketch);
    }

    @Override
    public void updateSketch(Sketch sketch) {
        sketchRepository.save(sketch);
    }

    @Override
    public void deleteSketch(Long id) {
        sketchRepository.delete(id);
    }
}
