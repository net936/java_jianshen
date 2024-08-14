package com.gk.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.study.entity.Qicai;
import com.gk.study.mapper.QicaiMapper;
import com.gk.study.service.QicaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QicaiServiceImpl extends ServiceImpl<QicaiMapper, Qicai> implements QicaiService {
    @Autowired
    QicaiMapper mapper;

    @Override
    public List<Qicai> getQicaiList() {
        return mapper.selectList(new QueryWrapper<>());
    }

    @Override
    public void createQicai(Qicai qicai) {
        System.out.println(qicai);
        mapper.insert(qicai);
    }

    @Override
    public void deleteQicai(String id) {
        mapper.deleteById(id);
    }

    @Override
    public void updateQicai(Qicai qicai) {
        mapper.updateById(qicai);
    }
}
