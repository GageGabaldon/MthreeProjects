/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fullstackclassroster.dao;

import com.example.fullstackclassroster.models.Course;
import com.example.fullstackclassroster.models.Student;
import com.example.fullstackclassroster.models.Teacher;
import java.util.List;

/**
 *
 * @author ggman
 */
public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}


