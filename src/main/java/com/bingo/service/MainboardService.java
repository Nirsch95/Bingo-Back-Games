package com.bingo.service;

import com.bingo.dao.MainboardDao;
import com.bingo.domain.Mainboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MainboardService implements IMainboardService{

    @Autowired
    private MainboardDao mainboardDao;

    @Override
    @Transactional
    public Mainboard save(Mainboard mainboard) {
        return mainboardDao.save(mainboard);
    }

}
