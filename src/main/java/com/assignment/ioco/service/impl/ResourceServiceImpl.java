package com.assignment.ioco.service.impl;

import com.assignment.ioco.entity.Survivor;
import com.assignment.ioco.payload.request.ResourceModel;
import com.assignment.ioco.service.ResourceService;

import javax.transaction.Transactional;
import java.util.List;

public class ResourceServiceImpl implements ResourceService {

    @Override
    @Transactional
    public void saveResources(Survivor survivor,List<ResourceModel> resourceModelList) {

    }
}
