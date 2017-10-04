package br.com.db1.exercicio2;

public class Roupa {
    private String marca;
    private Integer anoFabricacao;
    private Tamanho Tamanho;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public br.com.db1.exercicio2.Tamanho getTamanho() {
        return Tamanho;
    }
}
