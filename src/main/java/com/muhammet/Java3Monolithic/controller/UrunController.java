package com.muhammet.Java3Monolithic.controller;

import com.muhammet.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.muhammet.Java3Monolithic.dto.response.UrunGetFindByIdResponseDto;
import com.muhammet.Java3Monolithic.repository.entity.Urun;
import com.muhammet.Java3Monolithic.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.muhammet.Java3Monolithic.constants.EndPoints.*;

@RestController
@RequestMapping(VERSION+API+URUN)
@RequiredArgsConstructor
public class UrunController {

    private final UrunService urunService;

    /**
     * http://localhost:9090/urun/save?ad=Kalem&marka=TTMarka&model=TModel&fiyat=12&stok=240
     * http://localhost:9090/mkv1/api/urun/save?ad=%C5%9Feker&marka=tMarka&model=Bmodel&fiyat=2&stok=54
     * @return
     */
    @GetMapping(SAVE)
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

    @GetMapping(URUN_SAVE_DTO)
    public String save(UrunSaveRequestDto dto){
        urunService.save(dto);
        return "Ürün Kayıtedildi.";
    }

    /**
     * http://localhost:9090/mkv1/api/urun/getall
     * @return
     */
    @GetMapping(GETALL)
    public List<Urun> getAll(){
       return urunService.findAll();
    }

    @GetMapping(FINDBYID)
    public UrunGetFindByIdResponseDto getFindId(Long id){
        return urunService.findByIdDto(id);
    }
}
