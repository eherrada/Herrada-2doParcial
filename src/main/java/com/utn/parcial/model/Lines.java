package com.utn.parcial.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode

public class Lines {
    private Integer id;
    private String phoneNumber;

    public enum Type {
        MOBILE, RESIDENTIAL;
    }
    @JsonIdentityReference
    private Clients client;
    public enum Status {
        ACTIVE, SUSPENDED, CANCELLED;
    }
    private Status status;
}