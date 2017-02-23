package ws;

import feign.Param;
import feign.RequestLine;
import wrapper.RetornoWrapper;

/**
 * Created by alexsandrospecht on 22/02/17.
 */
public interface ReceitaWS {

    @RequestLine("GET /v1/cnpj/{cnpj}")
    String consulta(@Param("cnpj") String cnpj);

    @RequestLine("GET /v1/cnpj/{cnpj}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj);
}