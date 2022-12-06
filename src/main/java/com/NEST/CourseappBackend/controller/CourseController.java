package com.NEST.CourseappBackend.controller;

import com.NEST.CourseappBackend.model.CourseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String Home(){
        return "Home Page";
    }
    @PostMapping(path = "/addCourse", consumes = "application/json", produces = "application/json")
    public String AddCourse(@RequestBody CourseModel c){
        System.out.println(c.getCourseId());
        System.out.println(c.getCourseName());
        System.out.println(c.getCourseDate());
        System.out.println(c.getCourseVenue());
        System.out.println(c.getDuration());
        return "Course Added";
    }
    @GetMapping("/viewall")
    public String ViewAll(){
        return "view all courses";
    }
}
