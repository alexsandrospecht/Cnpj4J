package util;

import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;
import wrapper.RetornoWrapper;
import ws.ReceitaWS;

/**
 * Created by Alexsandro on 23/02/2017.
 */
public class ConsultaCnpj {

    private static final String RECEITA_WS_URL = "http://www.receitaws.com.br";

    public static RetornoWrapper consultaCnpj(String cnpj) {
        final ReceitaWS receitaWs = Feign
                                    .builder()
                                    .decoder(new GsonDecoder(new GsonBuilder().setDateFormat("dd/MM/yyyy").create()))
                                    .target(ReceitaWS.class, RECEITA_WS_URL);

        return receitaWs.consultaWrapper(cnpj);
    }

    public static String consultaData(String cnpj) {
        final ReceitaWS receitaWs = Feign
                .builder()
                .target(ReceitaWS.class, RECEITA_WS_URL);

        return receitaWs.consulta(cnpj);
    }
}
