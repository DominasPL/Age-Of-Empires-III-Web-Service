package com.github.dominaspl.aoewebservice.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ages")
@Data
@RequiredArgsConstructor
public class Age {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "age_id")
    private Long ageId;

    @Column(nullable = false, unique = true)
    private String ageName;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
