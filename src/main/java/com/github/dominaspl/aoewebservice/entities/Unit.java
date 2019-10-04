package com.github.dominaspl.aoewebservice.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "units")
@Data
@RequiredArgsConstructor
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long unitId;

    @Column(nullable = false, unique = true)
    private String unitName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_information_id", referencedColumnName = "unit_information_id")
    private UnitInformation unitInformation;

}
