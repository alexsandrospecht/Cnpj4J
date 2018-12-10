package com.github.alexsandrospecht.wrapper;

import java.util.Date;
import java.util.List;

public class RetornoWrapper {

    private String status;

    private String message;

    private String cnpj;

    private String tipo;

    private Date abertura;

    private String nome;

    private String fantasia;

    private List<AtividadeWrapper> atividade_principal;

    private List<AtividadeWrapper> atividades_secundarias;

    private String natureza_juridica;

    private String logradouro;

    private String numero;

    private String complemento;

    private String cep;

    private String bairro;

    private String municipio;

    private String uf;

    private String email;

    private String telefone;

    private String efr;

    private String situacao;

    private String data_situacao;

    private String motivo_situacao;

    private String situacao_especial;

    private String data_situacao_especial;

    private String capital_social;

    private List<SocioWrapper> qsa;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getAbertura() {
        return abertura;
    }

    public String getNome() {
        return nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public List<AtividadeWrapper> getAtividade_principal() {
        return atividade_principal;
    }

    public List<AtividadeWrapper> getAtividades_secundarias() {
        return atividades_secundarias;
    }

    public String getNatureza_juridica() {
        return natureza_juridica;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getUf() {
        return uf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEfr() {
        return efr;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getData_situacao() {
        return data_situacao;
    }

    public String getMotivo_situacao() {
        return motivo_situacao;
    }

    public String getSituacao_especial() {
        return situacao_especial;
    }

    public String getData_situacao_especial() {
        return data_situacao_especial;
    }

    public String getCapital_social() {
        return capital_social;
    }

    public List<SocioWrapper> getQsa() {
        return qsa;
    }

}