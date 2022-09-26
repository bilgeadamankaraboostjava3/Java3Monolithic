package com.muhammet.Java3Monolithic.controller;

import com.muhammet.Java3Monolithic.repository.entity.Musteri;
import com.muhammet.Java3Monolithic.repository.entity.view.VwMusteri;
import com.muhammet.Java3Monolithic.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/musteri")
@RequiredArgsConstructor
public class MusteriController {
    private final MusteriService musteriService;

    /**
     * localhost:9090/musteri/save
     */
    @GetMapping("/save")
    public String saveMusteri(String ad,String soyad, String adres){
        Musteri musteri = Musteri.builder()
                .ad(ad)
                .soyad(soyad)
                .adres(adres)
                .build();
        musteriService.save(musteri);
        return "Müşteri kaydedildi.";
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Musteri>> findAll(){
        return ResponseEntity.ok(musteriService.findAll());
    }

    @GetMapping("/findallview")
    public ResponseEntity<List<VwMusteri>> findAllView(){
        return ResponseEntity.ok(musteriService.getMusteriView());
    }


    /**
     * localhost:9090/musteri/findbyadres?adres=İstanbul
     * @param adres
     * @return
     */
    @GetMapping("/findbyadres")
    public ResponseEntity<List<Musteri>> findByAdres(String adres){
        return ResponseEntity.ok(musteriService.findByAdres(adres));
    }

}
