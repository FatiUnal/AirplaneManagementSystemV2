package com.example.airplaneprojectv2.service.airplane;

import com.example.airplaneprojectv2.builder.airplane.ExpeditionBuilder;
import com.example.airplaneprojectv2.dto.ExpeditionDto;
import com.example.airplaneprojectv2.dto.ExpeditionResponseDto;
import com.example.airplaneprojectv2.entity.Expedition;
import com.example.airplaneprojectv2.exceptions.ExpeditionNotFound;
import com.example.airplaneprojectv2.repository.ExpeditionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpeditionService implements IExpeditionService{
    private ExpeditionRepository expeditionRepository;
    private ExpeditionBuilder expeditionBuilder;

    public ExpeditionService(ExpeditionRepository expeditionRepository, ExpeditionBuilder expeditionBuilder) {
        this.expeditionRepository = expeditionRepository;
        this.expeditionBuilder = expeditionBuilder;
    }

    @Override
    public Expedition createExpedition(ExpeditionDto expeditionDto) {
        Expedition expedition = expeditionBuilder.getExpeditionByExpeditionDto(expeditionDto);
        return expeditionRepository.save(expedition);
    }

    @Override
    public List<ExpeditionResponseDto> getExpeditions() {

        List<ExpeditionResponseDto> liste = expeditionRepository.findAll().stream().map(expedition -> expeditionBuilder.getExpeditionResponseDtoByExpedition(expedition)).collect(Collectors.toList());
        return liste;
    }

    @Override
    public Expedition getById(int expeditionId) {
        return expeditionRepository.findById(expeditionId).orElseThrow(()->new ExpeditionNotFound(expeditionId));
    }
}
