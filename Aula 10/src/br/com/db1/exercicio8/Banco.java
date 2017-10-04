package br.com.db1.exercicio8;

import java.util.Date;

public class Banco {
    private String nome;
    private Date dataFundacao;
    private String publico;
    private Conta conta;

    public Boolean isPublico() {
        return true;
    }

    public Conta getConta() {
        return conta;
    }
}
