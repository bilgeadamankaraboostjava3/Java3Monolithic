package com.muhammet.Java3Monolithic.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblsatis")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Satis {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Long musterid;
    Long urunid;
    Double adet;
    Double fiyat;
    Double toplamfiyat;
    Long tarih;
    boolean isactive;

}
