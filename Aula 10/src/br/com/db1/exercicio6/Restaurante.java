package br.com.db1.exercicio6;

import java.util.Date;

public class Restaurante {
    private String nome;
    private Boolean serveAlmoco;
    private Boolean serveJantar;
    private Boolean serveCafeDaManha;
    private Endereco vEdereco;
    private Telefone vTelefone;
    private Pedido vPedido;

    public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal){

    }

    public Endereco getvEdereco() {
        return vEdereco;
    }

    public Telefone getvTelefone() {
        return vTelefone;
    }

    public Pedido getvPedido() {
        return vPedido;
    }

}
