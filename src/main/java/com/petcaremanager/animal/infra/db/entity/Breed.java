package com.petcaremanager.animal.infra.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="breed")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Breed implements Serializable {

    private static final long serialVersionUID = 7875787418639684933L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID uuid;

    @Column(name = "name", length = 30)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    private Species species;

    @OneToMany(mappedBy = "breed")
    private List<Animal> animals = new ArrayList<>();

    private boolean status;


}
