package com.lis.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nazir on 6/17/17.
 */
@Entity
public @Data class User {
    @Id
    private String username;
    private String password;
}
