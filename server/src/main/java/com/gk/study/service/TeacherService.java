package com.gk.study.service;



import com.gk.study.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getTeacherList();
    void createTeacher(Teacher teacher);
    void deleteTeacher(String id);

    void updateTeacher(Teacher teacher);
}
