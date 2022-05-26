package com.assignment.ioco.payload.request;

import com.assignment.ioco.common.ResourceName;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class ResourceModel implements Serializable {
    private static final long serialVersionUID = -3000672671670314610L;

    private ResourceName name;
}
