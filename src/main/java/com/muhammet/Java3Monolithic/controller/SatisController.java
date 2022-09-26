package com.muhammet.Java3Monolithic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestAPI yazmak için kullanıyoruz.
 */
@RestController
/**
 * URL: http://localhost:9090/satis
 */
@RequestMapping("/satis")
public class SatisController {
    /**
     * http://localhost:9090/satis/save
     * @return
     */
    @GetMapping("/save")
    public String save(){
        return "Kayıt Başarılı";
    }

    /**
     * http://localhost:9090/satis/update
     * @return
     */
    @GetMapping("/update")
    public String update(){
        return "Güncelleme Başarılı";
    }
}
