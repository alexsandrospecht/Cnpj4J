package com.github.alexsandrospecht.ws;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import com.github.alexsandrospecht.wrapper.RetornoWrapper;

public interface ReceitaWS {

    @RequestLine("GET /v1/cnpj/{cnpj}")
    String consulta(@Param("cnpj") String cnpj);

    @RequestLine("GET /v1/cnpj/{cnpj}")
    @Headers("Authorization: {token}")
    String consulta(@Param("cnpj") String cnpj, @Param("token") String token, @Param("days") Integer days);

    @RequestLine("GET /v1/cnpj/{cnpj}")
    @Headers("Authorization: {token}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj);

    @RequestLine("GET /v1/cnpj/{cnpj}/days/{days}")
    @Headers("Authorization: {token}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj, @Param("token") String token, @Param("days") Integer days);

}