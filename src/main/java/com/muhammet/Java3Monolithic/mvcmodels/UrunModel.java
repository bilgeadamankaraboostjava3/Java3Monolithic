package com.muhammet.Java3Monolithic.mvcmodels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UrunModel {
    private String title;
    private String username;
    private String urunAdi;
}
