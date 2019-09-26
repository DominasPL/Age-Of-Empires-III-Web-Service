package com.github.dominaspl.aoewebservice.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
