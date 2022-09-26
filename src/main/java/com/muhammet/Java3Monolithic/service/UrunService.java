package com.muhammet.Java3Monolithic.service;

import com.muhammet.Java3Monolithic.repository.IUrunRepository;
import com.muhammet.Java3Monolithic.repository.entity.Urun;
import com.muhammet.Java3Monolithic.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UrunService extends ServiceManager<Urun,Long> {
  private final IUrunRepository urunRepository;
  public UrunService(IUrunRepository urunRepository){
      super(urunRepository);
      this.urunRepository = urunRepository;
  }
}
