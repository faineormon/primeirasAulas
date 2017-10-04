package br.com.db1.exercicio8;

public class PessoaJuridica extends Pessoa{
    private Integer cnpj;

    String PessoaJuridica;

    private Boolean validarCnpj() {

        return true;
    }

    private String formatarCnpj() {
        return PessoaJuridica;
    }
}
