package com.example.airplaneprojectv2.builder.airplane;

import com.example.airplaneprojectv2.dto.ExpeditionDto;
import com.example.airplaneprojectv2.dto.ExpeditionResponseDto;
import com.example.airplaneprojectv2.entity.Expedition;
import org.springframework.stereotype.Component;

@Component
public class ExpeditionBuilder {

    public Expedition getExpeditionByExpeditionDto(ExpeditionDto expeditionDto){
        return new Expedition(expeditionDto.getDepartureAirport(),expeditionDto.getLandingAirport(),expeditionDto.getExpeditionTime());
    }

    public ExpeditionResponseDto getExpeditionResponseDtoByExpedition(Expedition expedition) {
        ExpeditionResponseDto expeditionResponseDto = new ExpeditionResponseDto(expedition.getExpeditionId(), expedition.getDepartureAirport(), expedition.getLandingAirport(), expedition.getExpeditionTime());

    return expeditionResponseDto;
    }
}

