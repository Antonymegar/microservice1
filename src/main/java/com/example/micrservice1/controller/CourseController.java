package com.example.micrservice1.controller;

import com.example.micrservice1.model.Course;
import com.example.micrservice1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class CourseController {
    @Autowired
    private CourseService courseService;
    /* A method that saves our object Course */
    @PostMapping("/course")
    public ResponseEntity<?> saveCourse(@RequestBody Course course ){
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }
    /* A method that delete our object Course */
    @DeleteMapping("{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId)
    {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    /* A method that responds with all our object CoursesS */
    @GetMapping("/courses")
    public ResponseEntity<?> getAllCourses(){
        return ResponseEntity.ok(courseService.findAllCourses());
    }






}
