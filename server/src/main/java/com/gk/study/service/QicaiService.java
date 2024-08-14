package com.gk.study.service;




import com.gk.study.entity.Qicai;

import java.util.List;

public interface QicaiService {
    List<Qicai> getQicaiList();
    void createQicai(Qicai qicai);
    void deleteQicai(String id);

    void updateQicai(Qicai qicai);
}
