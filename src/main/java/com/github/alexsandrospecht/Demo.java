package com.github.alexsandrospecht;

import com.github.alexsandrospecht.util.ConsultaCnpj;
import com.github.alexsandrospecht.wrapper.AtividadeWrapper;
import com.github.alexsandrospecht.wrapper.RetornoWrapper;

/**
 * Created by alexsandrospecht on 22/02/17.
 */
public class Demo {

    private static final String GOOGLE_CNPJ = "06990590000204";

    public static void main(String[] args) {
        System.out.println(ConsultaCnpj.consultaData(GOOGLE_CNPJ));

        RetornoWrapper wp = ConsultaCnpj.consultaCnpj(GOOGLE_CNPJ);
        System.out.println(wp.getCnpj());
        System.out.println(wp.getNome());
        System.out.println(wp.getAbertura());

        AtividadeWrapper aw = wp.getAtividade_principal().iterator().next();
        System.out.println(aw.getCode());
        System.out.println(aw.getText());
    }
}
