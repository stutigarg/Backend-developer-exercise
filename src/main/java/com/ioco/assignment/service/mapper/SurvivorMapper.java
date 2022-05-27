package com.ioco.assignment.service.mapper;

import com.ioco.assignment.domain.Resource;
import com.ioco.assignment.domain.Survivor;
import com.ioco.assignment.model.SurvivorModel;
import lombok.AccessLevel;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.nio.file.AccessMode;
import java.util.List;

@Component
@lombok.NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SurvivorMapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static Survivor map(SurvivorModel survivorRequest){
        Survivor survivor = new Survivor();
        survivor.setName(survivorRequest.getName());
        survivor.setAge(survivorRequest.getAge());
        survivor.setGender(survivorRequest.getGender());
        survivor.setLatitude(survivorRequest.getLocation().getLatitude());
        survivor.setLongitude(survivorRequest.getLocation().getLongitude());
        survivor.setResources(modelMapper.map(survivorRequest.getResources(),new TypeToken<List<Resource>>(){}.getType()));
        return survivor;
    }
}
