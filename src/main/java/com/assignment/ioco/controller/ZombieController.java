package com.assignment.ioco.controller;

import com.assignment.ioco.model.ZombieModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 *  Nobody can control the zombies. :evil_smile
 */
@RestController
@RequestMapping("/zombie")
public class ZombieController {

    @GetMapping("/{zombie-id}")
    public ZombieModel get(@PathParam("{zombie-id}") long zombieId) {
        return null;
    }
}
