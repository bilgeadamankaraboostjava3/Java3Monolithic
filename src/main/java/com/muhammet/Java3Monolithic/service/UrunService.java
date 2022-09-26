package com.muhammet.Java3Monolithic.service;

import com.muhammet.Java3Monolithic.dto.response.UrunGetFindByIdResponseDto;
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

  public UrunGetFindByIdResponseDto findByIdDto(Long id){
      Urun urun = urunRepository.getReferenceById(id);
      return UrunGetFindByIdResponseDto.builder()
              .ad(urun.getAd())
              .marka(urun.getMarka())
              .model(urun.getModel()).build();
  }
}
