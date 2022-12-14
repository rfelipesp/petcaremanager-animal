package com.petcaremanager.animal.infra.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer implements Serializable {

    private static final long serialVersionUID = 4225940332439763229L;

    @Id
    @Column(name = "id")
    private UUID uuid;

    @Column(name = "full_name",length = 50)
    private String fullName;

    @Column(name= "cpf", length = 11)
    @CPF(message = "Insira um CPF válido")
    private String cpf;

    private boolean status;

}


