package com.petcaremanager.animal.infra.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="weight")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weight implements Serializable {

    private static final long serialVersionUID = 3439849358377509658L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID uuid;

    @NotEmpty
    @Column(name = "value")
    private float value;

    @NotEmpty
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "weight_date")
    private LocalDate weightDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animal_id")
    private Animal animal;

}
