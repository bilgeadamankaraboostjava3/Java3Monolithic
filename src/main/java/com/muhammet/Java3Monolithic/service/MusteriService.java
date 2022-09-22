package com.muhammet.Java3Monolithic.service;

import com.muhammet.Java3Monolithic.repository.IMusteriRepository;
import com.muhammet.Java3Monolithic.repository.entity.Musteri;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * !! DİKKAT !!
 * Servisi işaretlemeyi unutmaytın.
 */
@Service
@RequiredArgsConstructor
public class MusteriService {
    /**
     * interface olarakn ektediğiniz Service ya da Repository gibi sınlarından
     * instance almak için Spring @Autowired annotaiton ını kullanabilirsiniz.
     */
    //@Autowired
    //IMusteriRepository musteriRepository;
//    public MusteriService(IMusteriRepository musteriRepository) {
//        this.musteriRepository = musteriRepository;
//    }

    private final IMusteriRepository musteriRepository;


    /**
     * Dİkkat, müşterityi kaydetmek içni veridğiniz de id si yoktur.
     * @param musteri
     * @return
     */
    public Musteri save(Musteri musteri){
       return musteriRepository.save(musteri);
    }

    /**
     * id yi de entity içinde vermelisisiz.
     * @param musteri
     * @return
     */
    public Musteri update(Musteri musteri){
        return musteriRepository.save(musteri);
    }
    public void delete(Musteri musteri){
        musteriRepository.delete(musteri);
    }
    public List<Musteri> findAll(){
        return musteriRepository.findAll();
    }

    public List<Musteri> findByAdres(String adres){
       return musteriRepository.findByAdres(adres);
    }
}
