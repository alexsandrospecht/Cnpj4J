package tests;

import com.github.alexsandrospecht.wrapper.AtividadeWrapper;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import com.github.alexsandrospecht.util.ConsultaCnpj;
import com.github.alexsandrospecht.wrapper.RetornoWrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Alexsandro on 23/02/2017.
 */
public class ConsultasTests {

    private static final String GOOGLE_CNPJ = "06990590000204";
    private static final String GLOBO_CNPJ = "27865757000102";

    @Test
    public void ConsultaCnpjGoogle() {
        final RetornoWrapper rw = ConsultaCnpj.consultaCnpj(GOOGLE_CNPJ);

        assertEquals("GOOGLE BRASIL INTERNET LTDA.", rw.getNome());
        assertEquals("06.990.590/0002-04", rw.getCnpj());
        assertEquals("56758501.00", rw.getCapital_social());

        assertThat(rw.getAtividade_principal(), CoreMatchers.notNullValue());

        AtividadeWrapper aw = rw.getAtividade_principal().iterator().next();
        assertEquals("00.00-0-00", aw.getCode());
        assertEquals("********", aw.getText());
    }

    @Test
    public void ConsultaCnpjGoogleData() {
        final String retorno = ConsultaCnpj.consultaData(GOOGLE_CNPJ);

        assertThat(retorno, CoreMatchers.containsString("GOOGLE BRASIL INTERNET LTDA."));
        assertThat(retorno, CoreMatchers.containsString("06.990.590/0002-04"));
    }

    @Test
    public void ConsultaCnpjGlobo() {
        final RetornoWrapper rw = ConsultaCnpj.consultaCnpj(GLOBO_CNPJ);

        assertEquals("GLOBO COMUNICACAO E PARTICIPACOES S/A", rw.getNome());
        assertEquals("27.865.757/0001-02", rw.getCnpj());
        assertThat(rw.getAtividade_principal(), CoreMatchers.notNullValue());
    }

    @Test
    public void ConsultaCnpjGloboData() {
        final String retorno = ConsultaCnpj.consultaData(GLOBO_CNPJ);

        assertThat(retorno, CoreMatchers.containsString("GLOBO COMUNICACAO E PARTICIPACOES S/A"));
        assertThat(retorno, CoreMatchers.containsString("27.865.757/0001-02"));
    }
}
