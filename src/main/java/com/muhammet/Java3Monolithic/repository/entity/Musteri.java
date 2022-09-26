package com.muhammet.Java3Monolithic.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tblmusteri")
@Entity
@AllArgsConstructor // parametreli constructor
@NoArgsConstructor // default constructor
@Data // getter setter
@SuperBuilder // builder pattern
public class Musteri extends Default {
    /**
     * Tüm property lerin getter ve setter ları eklenmeli.
     * Parametreli ve Parametresiz constructor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String ad;
    String soyad;
    String adres;
    String telefon;
    int dogumtarihi;
    String email;
    String username;
}
