package com.github.dominaspl.aoewebservice.entities;

import javax.persistence.*;

@Entity
@Table(name = "civilizations")
public class Civilization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long civilizationId;

    @Column(nullable = false, unique = true)
    private String civilizationName;


}
