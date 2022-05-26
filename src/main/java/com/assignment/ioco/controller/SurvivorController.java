package com.assignment.ioco.controller;

import com.assignment.ioco.payload.request.SurvivorRequest;
import com.assignment.ioco.service.SurvivorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SurvivorController {

    @Autowired
    private SurvivorService survivorService;

    @PostMapping(path ="/survivor")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("API to add survivor")
    public void saveSurvivor(@RequestBody SurvivorRequest request){
        survivorService.saveSurvivor(request);
    }

}
