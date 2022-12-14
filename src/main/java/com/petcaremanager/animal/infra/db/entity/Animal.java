package com.petcaremanager.animal.infra.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="animal")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Animal implements Serializable {

    private static final long serialVersionUID = 8126066112414797849L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID uuid;


    @Column(name = "name",length = 50)
    private String name;

    @Column(name = "gender", length = 10)
    private Gender gender;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "birth_date")
    private LocalDate birthDate;

    private boolean allergic;

    private boolean castrated;

    @Column(length = 100)
    private String microchip;

    @Column(length = 50)
    private String pedigree;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "breed_id")
    private Breed breed;

    @Column(name = "pelage")
    private String pelage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    private Species species;

    @Enumerated(EnumType.STRING)
    private Size size;

    @Column(name = "animal_note")
    private String note;

    private boolean status;

}
