package com.assignment.ioco.controller;

import com.assignment.ioco.model.ContaminationModel;
import com.assignment.ioco.model.LocationModel;
import com.assignment.ioco.model.SurvivorModel;
import com.assignment.ioco.service.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/survivor")
public class SurvivorController {

    @Autowired
    private SurvivorService survivorService;

    @GetMapping("/{survivor-id}")
    public SurvivorModel get(@PathVariable("survivor-id") long survivorId) {
        return null;
    }

    /**
     * Add survivors to the database
     * A survivor must have a name, age, gender, ID and last location (latitude, longitude).
     * A survivor also has an inventory of resources (which you need to declare upon the registration of the survivor). This can include Water, Food, Medication and Ammunition.
     *
     * @implNote Response header `Location` provides the GET API url to fetch the persisted survivor details
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSurvivor(@RequestBody SurvivorModel survivor) {
        survivorService.saveSurvivor(survivor);
    }

    /**
     * Update survivor location
     * A survivor must have the ability to update their last location, storing the new latitude/longitude pair in the base
     * @implNote no need to track locations, just replacing the previous one is enough.
     */
    @PatchMapping("/{survivor-id}/location")
    public LocationModel updateSurvivorLocation(@PathVariable("survivor-id") long survivorId, @RequestBody LocationModel location) {
        return null;
    }

    /**
     * Flag survivor as infected
     * In a chaotic situation like this, it's inevitable that a survivor may get transformed into a zombie.
     * When this happens, we need to flag the survivor as infected.
     * A survivor is marked as infected when at least three other survivors report their contamination.
     */
//    @PostMapping
//    public void reportZombieSuspect(ContaminationModel contamination) {
//        // Response status: OK or ACCEPTED for all valid unique requests
//        // Response header 'Location': Get survivor by Id if #unique complains is < 3, Get zombie by Id url otherwise
//        // Return 4xx (kinda duplicate request or something) for non-unique requests
//    }

}
