package com.example.store.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private ProduktSize size;

    @ManyToOne(targetEntity = Kategories.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "kategory_id")
    @JsonIgnore
    private Kategories kategory;
}
