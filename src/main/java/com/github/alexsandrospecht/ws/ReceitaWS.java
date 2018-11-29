package com.github.alexsandrospecht.ws;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import com.github.alexsandrospecht.wrapper.RetornoWrapper;

/**
 * Created by alexsandrospecht on 22/02/17.
 */
public interface ReceitaWS {

    @RequestLine("GET /v1/cnpj/{cnpj}")
    String consulta(@Param("cnpj") String cnpj);


    @RequestLine("GET /v1/cnpj/{cnpj}")
    String consulta(@Param("cnpj") String cnpj, @Param("token") String token);

    @RequestLine("GET /v1/cnpj/{cnpj}")
    @Headers("Authorization: {token}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj);

    @RequestLine("GET /v1/cnpj/{cnpj}")
    @Headers("Authorization: {token}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj, @Param("token") String token);

}