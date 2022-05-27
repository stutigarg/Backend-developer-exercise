package com.assignment.ioco.service.mapper;

import com.assignment.ioco.entity.Resource;
import com.assignment.ioco.entity.Survivor;
import com.assignment.ioco.model.SurvivorModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class SurvivorMapper {

    private ModelMapper modelMapper;

    public SurvivorMapper(){
        modelMapper = new ModelMapper();}
    public void merge(SurvivorModel survivorRequest, Survivor survivor){
        survivor.setName(survivorRequest.getName());
        survivor.setAge(survivorRequest.getAge());
        survivor.setGender(survivorRequest.getGender());
        survivor.setLatitude(survivorRequest.getLocation().getLatitude());
        survivor.setLongitude(survivorRequest.getLocation().getLongitude());
        survivor.setResources(modelMapper.map(survivorRequest.getResources(),new TypeToken<List<Resource>>(){}.getType()));
    }
}
