package com.sketchpad.controllers.rest;

import com.sketchpad.domain.Sketch;
import com.sketchpad.services.SketchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
@RestController
@RequestMapping("/sketch")
public class SketchRestController {

    @Autowired
    SketchService sketchService;

    @GetMapping("/all")
    @ResponseBody
    public Collection<Sketch> getAllSketches(){
        return sketchService.getAllSketches();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Sketch getSketchById(@PathVariable Long id){
        return sketchService.getSketchById(id);
    }

    @PostMapping("/")
    @ResponseBody
    public Sketch createSketch(@RequestBody Sketch sketch){
        return sketchService.createSketch(sketch);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void updateSketchById(@PathVariable Long id, @RequestBody Sketch sketch){
        sketchService.updateSketch(sketch);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteSketch(@PathVariable Long id){
        sketchService.deleteSketch(id);
    }

}
