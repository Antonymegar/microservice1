package com.example.micrservice1.service;


import com.example.micrservice1.model.Course;
import com.example.micrservice1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService
{
    @Autowired
    private  final  CourseRepository courseRepo;

    public CourseServiceImpl (CourseRepository courseRepo){
        this.courseRepo=courseRepo;
    }

    @Override
    public Course saveCourse(Course course) {
        course.setCreateTime(
                LocalDateTime.now());
          return courseRepo.save(course);
    }
    @Override
    public void deleteCourse(Long courseId){
        courseRepo.deleteById(courseId);
    }
    @Override
    public List<Course> findAllCourses(){
        return courseRepo.findAll();
    }

}
