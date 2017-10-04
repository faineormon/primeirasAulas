package br.com.db1.exercicio4;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNacimento;
    private Sexo Sexo;
    private Telefone Telefone;

    public br.com.db1.exercicio4.Sexo getSexo() {
        return Sexo;
    }

    public br.com.db1.exercicio4.Telefone getTelefone() {
        return Telefone;
    }
}
