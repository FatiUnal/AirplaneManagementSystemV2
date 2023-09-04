package com.example.airplaneprojectv2.controller.airplane;

import com.example.airplaneprojectv2.dto.ExpeditionDto;
import com.example.airplaneprojectv2.dto.ExpeditionResponseDto;
import com.example.airplaneprojectv2.entity.Expedition;
import com.example.airplaneprojectv2.service.airplane.IExpeditionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/expedition")
public class ExpeditionController {
    private IExpeditionService iExpeditionService;

    public ExpeditionController(IExpeditionService iExpeditionService) {
        this.iExpeditionService = iExpeditionService;
    }

    @PostMapping
    public ResponseEntity<Expedition> createExpedition(@RequestBody ExpeditionDto expeditionDto){
        return new ResponseEntity<>(iExpeditionService.createExpedition(expeditionDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ExpeditionResponseDto>> getExpedition(){
        return new ResponseEntity<>(iExpeditionService.getExpeditions(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Expedition> getById(@PathVariable int id){
        return new ResponseEntity<>(iExpeditionService.getById(id),HttpStatus.CREATED);
    }
}

