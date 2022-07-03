package com.example.micrservice1.repository;

import com.example.micrservice1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

