package com.NEST.CourseappBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseModel {
    @Id
    @GeneratedValue
    private int id;
    private int courseId;
    private String courseName;
    private String courseVenue;
    private String duration;
    private String courseDate;

    public CourseModel() {
    }

    public CourseModel(int id, int courseId, String courseName, String courseVenue, String duration, String courseDate) {
        this.id = id;
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseVenue = courseVenue;
        this.duration = duration;
        this.courseDate = courseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseVenue() {
        return courseVenue;
    }

    public void setCourseVenue(String courseVenue) {
        this.courseVenue = courseVenue;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }
}
