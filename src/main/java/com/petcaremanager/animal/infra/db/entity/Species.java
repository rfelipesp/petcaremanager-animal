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
@Table(name="species")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Species implements Serializable {

    private static final long serialVersionUID = -2029843991056344371L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID uuid;

    @Column(name = "name", length = 30)
    private String name;

    private boolean status;

    @OneToMany(mappedBy = "species")
    private List<Animal> animals = new ArrayList<>();

    @OneToMany(mappedBy = "species")
    private List<Breed> breeds = new ArrayList<>();


}
