package com.example.airplaneprojectv2.service.airplane;

import com.example.airplaneprojectv2.dto.ExpeditionDto;
import com.example.airplaneprojectv2.dto.ExpeditionResponseDto;
import com.example.airplaneprojectv2.entity.Expedition;

import java.util.List;

public interface IExpeditionService {
    Expedition createExpedition(ExpeditionDto expeditionDto);

    List<ExpeditionResponseDto> getExpeditions();

    Expedition getById(int expeditionId);
}
