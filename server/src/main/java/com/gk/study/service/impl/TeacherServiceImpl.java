package com.gk.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.study.entity.Teacher;
import com.gk.study.mapper.TeacherMapper;
import com.gk.study.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Autowired
    TeacherMapper mapper;

    @Override
    public List<Teacher> getTeacherList() {
        return mapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void createTeacher(Teacher teacher) {
        System.out.println(teacher);
        mapper.insert(teacher);
    }

    @Override
    public void deleteTeacher(String id) {
        mapper.deleteById(id);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        mapper.updateById(teacher);
    }
}
