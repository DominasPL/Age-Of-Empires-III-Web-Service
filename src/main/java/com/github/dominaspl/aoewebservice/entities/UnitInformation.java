package com.github.dominaspl.aoewebservice.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "units_informations")
public class UnitInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_information_id")
    private Long unitInformationId;

    @ManyToMany
    @JoinTable(name = "units_informations_types",
                joinColumns = @JoinColumn(name = "unit_information_id"),
                inverseJoinColumns = @JoinColumn(name = "type_id"))
    private List<Type> types = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "civilization_id")
    private Civilization civilization;

    @ManyToOne
    @JoinColumn(name = "age_id")
    private Age age;
}
