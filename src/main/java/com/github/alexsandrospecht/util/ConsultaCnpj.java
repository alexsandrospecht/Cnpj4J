package com.github.alexsandrospecht.util;

import com.google.common.base.CharMatcher;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;
import com.github.alexsandrospecht.wrapper.RetornoWrapper;
import com.github.alexsandrospecht.ws.ReceitaWS;

/**
 * Created by Alexsandro on 23/02/2017.
 */
public class ConsultaCnpj {

    private static final String RECEITA_WS_URL = "https://www.receitaws.com.br";
    private static final String DEFAULT_CNPJ = "00000000000000";

    public static RetornoWrapper consultaCnpj(String cnpj) {
        return consultaCnpj(
                new GsonDecoder(
                        new GsonBuilder()
                                .setDateFormat("dd/MM/yyyy")
                                .create())
                , cnpj);
    }

    public static RetornoWrapper consultaCnpj(String cnpj, String token, Integer days) {
        return consultaCnpj(
                new GsonDecoder(
                        new GsonBuilder()
                                .setDateFormat("dd/MM/yyyy")
                                .create())
                , cnpj, token, days);
    }

    public static RetornoWrapper consultaCnpj(GsonDecoder decoder, String cnpj) {
        return Feign
                .builder()
                .decoder(decoder)
                .target(ReceitaWS.class, RECEITA_WS_URL)
                .consultaWrapper(retainDigits(cnpj));
    }

    public static RetornoWrapper consultaCnpj(GsonDecoder decoder, String cnpj, String token, Integer days) {
        return Feign
                .builder()
                .decoder(decoder)
                .target(ReceitaWS.class, RECEITA_WS_URL)
                .consultaWrapper(retainDigits(cnpj), "Bearer "+token, days);
    }

    public static String consultaData(String cnpj) {
        return Feign
                .builder()
                .target(ReceitaWS.class, RECEITA_WS_URL)
                .consulta(retainDigits(cnpj));
    }

    public static String consultaData(String cnpj, String token, Integer days) {
        return Feign
                .builder()
                .target(ReceitaWS.class, RECEITA_WS_URL)
                .consulta(retainDigits(cnpj), token, days);
    }

    private static String retainDigits(String cnpj) {
        final String digits = CharMatcher.digit().retainFrom(cnpj);

        if (digits.length() != 14) {
            return DEFAULT_CNPJ;
        }
        return digits;
    }
}
