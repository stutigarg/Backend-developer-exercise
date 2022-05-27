package com.assignment.ioco.model;

import com.assignment.ioco.entity.Resource;
import com.assignment.ioco.entity.Survivor;

import java.io.Serializable;
import java.util.List;

@lombok.Getter
@lombok.Setter
public class SurvivorModel implements Serializable {
    private Long id;
    private String name;
    private int age;
    private Survivor.Gender gender;
    private LocationModel location;

    private List<Resource> resources;

}
