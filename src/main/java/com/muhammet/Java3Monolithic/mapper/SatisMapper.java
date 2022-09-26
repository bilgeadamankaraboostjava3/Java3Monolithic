package com.muhammet.Java3Monolithic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SatisMapper {

    SatisMapper INSTANCE = Mappers.getMapper(SatisMapper.class);

}
