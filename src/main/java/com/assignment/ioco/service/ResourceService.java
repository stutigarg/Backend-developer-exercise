package com.assignment.ioco.service;

import com.assignment.ioco.entity.Survivor;
import com.assignment.ioco.payload.request.ResourceModel;

import java.util.List;

public interface ResourceService {
    void saveResources(Survivor survivor, List<ResourceModel> resourceModelList);
}
