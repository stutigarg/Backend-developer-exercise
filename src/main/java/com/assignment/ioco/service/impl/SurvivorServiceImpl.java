package com.assignment.ioco.service.impl;

import com.assignment.ioco.entity.Survivor;
import com.assignment.ioco.model.SurvivorModel;
import com.assignment.ioco.repository.SurvivorRepository;
import com.assignment.ioco.service.SurvivorService;
import com.assignment.ioco.service.mapper.SurvivorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SurvivorServiceImpl implements SurvivorService {


    @Autowired
    private SurvivorRepository survivorRepository;

    @Autowired
    private SurvivorMapper survivorMapper;

    @Override
    @Transactional
    public void saveSurvivor(SurvivorModel request) {
        Survivor survivor = new Survivor();
        survivorMapper.merge(request, survivor);
        survivorRepository.save(survivor);
    }
}
