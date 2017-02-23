package com.github.alexsandrospecht.util;

import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;
import com.github.alexsandrospecht.wrapper.RetornoWrapper;
import com.github.alexsandrospecht.ws.ReceitaWS;

/**
 * Created by Alexsandro on 23/02/2017.
 */
public class ConsultaCnpj {

    private static final String RECEITA_WS_URL = "http://www.receitaws.com.br";

    public static RetornoWrapper consultaCnpj(String cnpj) {
        return consultaCnpj(
                new GsonDecoder(
                        new GsonBuilder()
                                .setDateFormat("dd/MM/yyyy")
                                .create())
                , cnpj);
    }

    public static RetornoWrapper consultaCnpj(GsonDecoder decoder, String cnpj) {
        return Feign
                .builder()
                .decoder(decoder)
                .target(ReceitaWS.class, RECEITA_WS_URL)
                .consultaWrapper(cnpj);
    }

    public static String consultaData(String cnpj) {
        return Feign
                .builder()
                .target(ReceitaWS.class, RECEITA_WS_URL)
                .consulta(cnpj);
    }
}
