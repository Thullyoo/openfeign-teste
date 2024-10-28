package com.thullyoo.openfeign_teste.dto;

public record EnderecoResponse(String cep,
                              String logradouro,
                              String complemento,
                              String unidade,
                              String bairro ,
                              String localidade,
                              String uf,
                              String estado,
                              String regiao,
                              String ibge,
                              String gia,
                              String ddd,
                              String siafi) {
    @Override
    public String toString() {
        return "EnderecoResponse{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", unidade='" + unidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", estado='" + estado + '\'' +
                ", regiao='" + regiao + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}
