package com.assignment.ioco.domain;

import com.assignment.ioco.domain.base.LocatableEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Thought:
 *
 * Survivor and Zombie should be kept separate, because as lehman it makes sense to keep both separate. They are 2 different entities. Period.
 * Also, for zombies, definition for standard attributes may differ that we've for survivor, for example: gender, age (debatable).
 * Also, we don't know what happens with resources once a survivor turns into a zombie.
 *
 * Thereby, whenever a survivor is reported to have contaminated 3 peers, make an entry to Zombies (and delete from Survivor).
 * This migration may look like an additional cost, but it'll help with all subsequent processes.
 */
public class Zombie extends LocatableEntity implements Serializable {

    private static final long serialVersionUID = -6853515541145301632L;

    private Long id;
    private Long personId; // Good to have. Not a FK.
    // Other attributes that we've carried over from origin Survivor class

    private LocalDateTime transformedAt;

}
