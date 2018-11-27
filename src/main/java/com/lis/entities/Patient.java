package com.lis.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by nazir on 6/10/17.
 */
@Entity
@NoArgsConstructor
public @Data class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String otherName;
}
