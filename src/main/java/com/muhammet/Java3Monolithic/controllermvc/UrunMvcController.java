package com.muhammet.Java3Monolithic.controllermvc;

import static com.muhammet.Java3Monolithic.constants.EndPoints.*;

import com.muhammet.Java3Monolithic.mvcmodels.UrunModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(URUN)
public class UrunMvcController {
    // http://localhost:9090/urun
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        model.addObject("urunmodel",
                UrunModel.builder()
                        .urunAdi("Şeker")
                        .username("Muhammet")
                        .title("Ürün Ekleme Sayfası")
                        .build()
                );
        model.setViewName("urun");
        return model;
    }
}
