package br.com.db1.exercicio8;

public class Conta {
    private Integer numero;
    private Integer digitoVerificador;
    private Agencia agencia;
    private Pessoa pessoa;

    public void calculaDigitoVerificador() {
        return;
    }

    public Boolean validarDigitoVerificador() {
        return true;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
