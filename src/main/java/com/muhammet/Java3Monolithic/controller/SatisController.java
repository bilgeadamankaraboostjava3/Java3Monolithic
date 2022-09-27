package com.muhammet.Java3Monolithic.controller;

import com.muhammet.Java3Monolithic.exception.ErrorType;
import com.muhammet.Java3Monolithic.exception.MonolitichManagerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.Java3Monolithic.constants.EndPoints.*;
/**
 * RestAPI yazmak için kullanıyoruz.
 */
@RestController
/**
 * URL: http://localhost:9090/satis
 */
@RequestMapping(VERSION+API+SATIS)
public class SatisController {
    /**
     * http://localhost:9090/satis/save
     * @return
     */
    @GetMapping(SAVE)
    public String save(){
        return "Kayıt Başarılı";
    }

    /**
     * http://localhost:9090/satis/update
     * @return
     */
    @GetMapping(UPDATE)
    public String update(){
        return "Güncelleme Başarılı";
    }

    @GetMapping("/hataolustur")
    public String hataOlustur(){
        throw new MonolitichManagerException(ErrorType.SATIS_EKLEME_SORUNU);
    }
}
