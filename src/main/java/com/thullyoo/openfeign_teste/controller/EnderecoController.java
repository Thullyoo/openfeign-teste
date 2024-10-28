package com.thullyoo.openfeign_teste.controller;

import com.thullyoo.openfeign_teste.dto.EnderecoRequest;
import com.thullyoo.openfeign_teste.dto.EnderecoResponse;
import com.thullyoo.openfeign_teste.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<EnderecoResponse> getEndereco(@RequestBody EnderecoRequest enderecoRequest){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.getEndereco(enderecoRequest));
    }

}
