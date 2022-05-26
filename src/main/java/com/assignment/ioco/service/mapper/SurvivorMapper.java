package com.assignment.ioco.service.mapper;

import com.assignment.ioco.entity.Survivor;
import com.assignment.ioco.payload.request.SurvivorRequest;
import org.springframework.stereotype.Component;

@Component
public class SurvivorMapper {

    public void merge(SurvivorRequest survivorRequest, Survivor survivor){
        survivor.setName(survivorRequest.getName());
        survivor.setAge(survivorRequest.getAge());
        survivor.setGender(survivorRequest.getGender());
        survivor.setLongitude(survivorRequest.getLongitude());
        survivor.setLatitude(survivorRequest.getLatitude());
    }
}
