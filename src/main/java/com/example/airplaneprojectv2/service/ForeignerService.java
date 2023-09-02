package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.builder.ForeignerBuilder;
import com.example.airplaneprojectv2.dto.ForeignerDto;
import com.example.airplaneprojectv2.entity.Foreigner;
import com.example.airplaneprojectv2.repository.ForeignerRepository;
import org.springframework.stereotype.Service;

@Service
public class ForeignerService implements IForeignerService{
    private ForeignerRepository foreignerRepository;
    private ForeignerBuilder foreignerBuilder;

    public ForeignerService(ForeignerRepository foreignerRepository, ForeignerBuilder foreignerBuilder) {
        this.foreignerRepository = foreignerRepository;
        this.foreignerBuilder = foreignerBuilder;
    }

    @Override
    public Foreigner getAdminByEmail(String email) {
        return foreignerRepository.getByEmail(email);
    }

    @Override
    public Foreigner createForeigner(ForeignerDto foreignerDto) {
        Foreigner foreigner = foreignerBuilder.getForeignerByForeignerDto(foreignerDto);
        return foreignerRepository.save(foreigner);
    }
}
