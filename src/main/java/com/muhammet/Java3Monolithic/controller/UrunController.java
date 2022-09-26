package com.muhammet.Java3Monolithic.controller;

import com.muhammet.Java3Monolithic.repository.entity.Urun;
import com.muhammet.Java3Monolithic.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/urun")
@RequiredArgsConstructor
public class UrunController {

    private final UrunService urunService;

    /**
     * http://localhost:9090/urun/save?ad=Kalem&marka=TTMarka&model=TModel&fiyat=12&stok=240
     * @return
     */
    @GetMapping("/save")
    public String save(String ad, String marka, String model,
                       Double fiyat, Integer stok){
        Urun urun = Urun.builder()
                .ad(ad)
                .marka(marka)
                .model(model)
                .fiyat(fiyat)
                .stok(stok)
                .build();
        urunService.save(urun);
        return "Ürün Kayıtedildi.";
    }
    @GetMapping("/findall")
    public List<Urun> findAll(){
       return urunService.findAll();
    }
}
