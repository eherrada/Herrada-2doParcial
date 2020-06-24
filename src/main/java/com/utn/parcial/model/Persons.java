package com.utn.parcial.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public abstract class Persons {
    @ApiModelProperty(value = "Id de la persona", required = false)
    private Integer id;
    private String name;
    private String lastName;
    private Integer dni;
    private String userName;
    private String password;
    private Boolean active;
}
