package com.example.social.entities;

import jakarta.persistence.*;

@Entity
public class Tweet {

    @Column(name="reposts")
    private Long Reposts;


}
