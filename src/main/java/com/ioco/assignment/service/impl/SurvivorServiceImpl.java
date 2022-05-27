package com.ioco.assignment.service.impl;

import com.ioco.assignment.domain.Survivor;
import com.ioco.assignment.model.SurvivorModel;
import com.ioco.assignment.repository.SurvivorRepository;
import com.ioco.assignment.service.SurvivorService;
import com.ioco.assignment.service.mapper.SurvivorMapper;
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
        Survivor survivor = survivorMapper.map(request);
        survivorRepository.save(survivor);
    }
}
