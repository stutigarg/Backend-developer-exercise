package com.ioco.assignment.domain.base;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class LocatableEntity implements Serializable {

    private static final long serialVersionUID = -1590646033450634786L;

    private Double latitude;
    private Double longitude;
}
