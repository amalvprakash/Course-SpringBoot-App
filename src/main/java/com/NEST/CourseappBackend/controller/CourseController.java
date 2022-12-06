package com.NEST.CourseappBackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping("/")
    public String Home(){
        return "Home Page";
    }
    @PostMapping("/addCourse")
    public String AddCourse(){
        return "Course Added";
    }
}
