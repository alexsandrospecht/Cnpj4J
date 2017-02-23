/**
 * Created by alexsandrospecht on 22/02/17.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;
import wrapper.RetornoWrapper;
import ws.ReceitaWS;

public class Demo {

    public static void main(String[] args) {
        ReceitaWS receita = Feign.builder()
                .target(ReceitaWS.class, "http://www.receitaws.com.br");

        String retorno = receita.consulta("06990590000204");

        System.err.println(retorno);

        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        GsonDecoder decoder = new GsonDecoder(gson);

        receita = Feign.builder()
                .decoder(decoder)
                .target(ReceitaWS.class, "http://www.receitaws.com.br");

        RetornoWrapper wp = receita.consultaWrapper("06990590000204");

        System.err.println(wp.getCnpj());
        System.err.println(wp.getNome());
        System.err.println(wp.getAbertura());
        System.err.println(wp.getAtividade_principal().get(0).getCode());
        System.err.println(wp.getAtividade_principal().get(0).getText());
    }
}
