import util.ConsultaCnpj;
import wrapper.RetornoWrapper;

/**
 * Created by alexsandrospecht on 22/02/17.
 */
public class Demo {

    private static final String GOOGLE_CNPJ = "06990590000204";

    public static void main(String[] args) {
        System.err.println(ConsultaCnpj.consultaData(GOOGLE_CNPJ));

        RetornoWrapper wp = ConsultaCnpj.consultaCnpj(GOOGLE_CNPJ);

        System.err.println(wp.getCnpj());
        System.err.println(wp.getNome());
        System.err.println(wp.getAbertura());
        System.err.println(wp.getAtividade_principal().get(0).getCode());
        System.err.println(wp.getAtividade_principal().get(0).getText());
    }
}
