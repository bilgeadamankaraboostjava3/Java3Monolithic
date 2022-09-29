package com.muhammet.Java3Monolithic.mvcmodels;

import com.muhammet.Java3Monolithic.repository.entity.Urun;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HomeModel {
    String baslik;
    List<String> menulistesi;
    String kullaniciadi;
    String avatar;
    List<Urun> urunler;
}
