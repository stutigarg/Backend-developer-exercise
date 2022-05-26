package com.assignment.ioco.payload.request;

import com.assignment.ioco.common.ResourceName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.List;

@ApiModel
@Getter
@Setter
@Validated
public class SurvivorRequest implements Serializable {
    public static final long serialVersionUID = 3517977634975087133L;

    @ApiModelProperty
    private String name;

    @ApiModelProperty
    private int age;

    @ApiModelProperty
    private String gender;

    @ApiModelProperty
    private double latitude;

    @ApiModelProperty
    private double longitude;

    @ApiModelProperty
    private List<ResourceName> resourceName;

}
