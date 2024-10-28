package com.thullyoo.openfeign_teste.service;

import com.thullyoo.openfeign_teste.dto.EnderecoRequest;
import com.thullyoo.openfeign_teste.dto.EnderecoResponse;
import com.thullyoo.openfeign_teste.openfeign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private FeignService feignService;

    public EnderecoResponse getEndereco(EnderecoRequest enderecoRequest){
        EnderecoResponse enderecoResponse = feignService.getEndereco(enderecoRequest.cep());
        System.out.println(enderecoResponse.toString());
        return enderecoResponse;
    }

}
