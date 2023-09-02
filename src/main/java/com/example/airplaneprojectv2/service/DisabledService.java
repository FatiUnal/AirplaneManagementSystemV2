package com.example.airplaneprojectv2.service;

import com.example.airplaneprojectv2.builder.DisabledBuilder;
import com.example.airplaneprojectv2.dto.DisabledDto;
import com.example.airplaneprojectv2.entity.Disabled;
import com.example.airplaneprojectv2.repository.DisabledRepository;
import org.springframework.stereotype.Service;

@Service
public class DisabledService implements IDisabledService{
    private DisabledRepository disabledRepository;
    private DisabledBuilder disabledBuilder;

    public DisabledService(DisabledRepository disabledRepository, DisabledBuilder disabledBuilder) {
        this.disabledRepository = disabledRepository;
        this.disabledBuilder = disabledBuilder;
    }

    @Override
    public Disabled getAdminByEmail(String email) {
        return disabledRepository.getByEmail(email);
    }

    @Override
    public Disabled createDisabled(DisabledDto disabledDto) {
        Disabled disabled = disabledBuilder.getDisabledByDisabledDto(disabledDto);
        return disabledRepository.save(disabled);
    }
}
