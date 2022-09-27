package com.muhammet.Java3Monolithic.service;

import com.muhammet.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.muhammet.Java3Monolithic.dto.response.UrunGetFindByIdResponseDto;
import com.muhammet.Java3Monolithic.mapper.UrunMapper;
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

  public Urun save(UrunSaveRequestDto dto){
      /**
       * Urun Mapper ile dışarıdan gelen ürün bilgilerini içeren
       * DTO yu Urun Entity sine dönüştürüyoruz.
       */
     Urun urun = UrunMapper.INSTANCE.toUrun(dto);
     urun.setCreatedate(System.currentTimeMillis());
     urun.setIsactive(true);
      /**
       * Urun Entity sini veritabanına kaydediyoruz.
       * DİKKAT!!!!!
       * kayıt edilen urun nesnesine kayıt sonrası
       * ID bilgisi işlenir.
       */
     urunRepository.save(urun);
     return urun;
  }

}
