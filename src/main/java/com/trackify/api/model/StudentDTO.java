package com.trackify.api.model;

import com.trackify.api.entity.Student;

public class StudentDTO {
    private Long id;
    private String name;

    // Constructor
    public StudentDTO(Student student) {
        this.id = student.getId();
        this.name = student.getName();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
}
