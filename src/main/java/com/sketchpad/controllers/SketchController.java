package com.sketchpad.controllers;

import com.sketchpad.domain.Sketch;
import com.sketchpad.services.SketchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
@RestController
@RequestMapping("/scetch")
public class SketchController {

    @Autowired
    SketchService sketchService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Sketch> getAllSketches(){
        return sketchService.getAllSketches();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Sketch getSketchById(@PathVariable Long id){
        return sketchService.getSketchById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    public Sketch createSketch(@RequestBody Sketch sketch){
        return sketchService.createSketch(sketch);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    @ResponseBody
    public void updateSketchById(@PathVariable Long id, @RequestBody Sketch sketch){
        sketchService.updateSketch(sketch);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public void deleteSketch(@PathVariable Long id){
        sketchService.deleteSketch(id);
    }

}
