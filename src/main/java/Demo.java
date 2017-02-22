/**
 * Created by alexsandrospecht on 22/02/17.
 */

import feign.Feign;
import wrapper.RetornoWrapper;
import ws.ReceitaWS;
import feign.gson.GsonDecoder;

public class Demo {

    public static void main(String[] args) {
        ReceitaWS receita = Feign.builder()
//                .decoder(new GsonDecoder())
                .target(ReceitaWS.class, "http://www.receitaws.com.br");

        String retorno = receita.consulta("06990590000204");

        System.err.println(retorno);



        receita = Feign.builder()
                .decoder(new GsonDecoder())
                .target(ReceitaWS.class, "http://www.receitaws.com.br");

        RetornoWrapper wp = receita.consultaWrapper("06990590000204");

        System.err.println(wp.getCnpj());
    }
}
