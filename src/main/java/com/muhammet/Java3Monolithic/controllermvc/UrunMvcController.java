package com.muhammet.Java3Monolithic.controllermvc;

import com.muhammet.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.muhammet.Java3Monolithic.repository.entity.Urun;
import com.muhammet.Java3Monolithic.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/urun")
@RequiredArgsConstructor
public class UrunMvcController {

    private final UrunService urunService;
    // http://localhost:9090/urun/save
    @PostMapping("/save")
    public ModelAndView save(UrunSaveRequestDto dto){
        urunService.save(dto);
        return new ModelAndView("redirect:/home");
    }
}
