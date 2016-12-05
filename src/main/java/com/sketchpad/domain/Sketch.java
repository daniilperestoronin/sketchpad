package com.sketchpad.domain;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
public class Sketch implements Serializable{
    private Long id;
    private String name;
    private Collection<String> tags;
    private String text;

    public Sketch() {
    }

    public Sketch(Long id, String name, Collection<String> tags, String text) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public Sketch setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Sketch setName(String name) {
        this.name = name;
        return this;
    }

    public Collection<String> getTags() {
        return tags;
    }

    public Sketch setTags(Collection<String> tags) {
        this.tags = tags;
        return this;
    }

    public String getText() {
        return text;
    }

    public Sketch setText(String text) {
        this.text = text;
        return this;
    }
}
