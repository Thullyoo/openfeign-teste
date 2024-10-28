package com.thullyoo.openfeign_teste.openfeign;

import com.thullyoo.openfeign_teste.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "ViaCep")
public interface FeignService {

    @GetMapping("/{cep}/json")
    EnderecoResponse getEndereco(@PathVariable("cep") String cep);
}
