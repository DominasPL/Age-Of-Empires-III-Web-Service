package com.github.dominaspl.aoewebservice.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "civilizations")
@Data
@RequiredArgsConstructor
public class Civilization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long civilizationId;

    @Column(nullable = false, unique = true)
    private String civilizationName;




}
