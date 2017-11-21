package com.sketchpad.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Perestoronin Daniil
 */
@Entity
@Table(name = "sketch")
public class Sketch implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "text")
    private String text;

    public Sketch() {
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

    public String getText() {
        return text;
    }

    public Sketch setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sketch sketch = (Sketch) o;
        return Objects.equals(id, sketch.id) &&
                Objects.equals(name, sketch.name) &&
                Objects.equals(text, sketch.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text);
    }
}
