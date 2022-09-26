package com.muhammet.Java3Monolithic.service;

import com.muhammet.Java3Monolithic.repository.ISatisRepository;
import com.muhammet.Java3Monolithic.repository.entity.Satis;
import com.muhammet.Java3Monolithic.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SatisService extends ServiceManager<Satis,Long> {
    private final ISatisRepository satisRepository;
    public SatisService(ISatisRepository satisRepository){
        super(satisRepository);
        this.satisRepository = satisRepository;
    }
}
