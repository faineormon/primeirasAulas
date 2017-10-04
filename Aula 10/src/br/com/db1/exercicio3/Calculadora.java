package br.com.db1.exercicio3;

public class Calculadora {
    private Double resultado;
    private Double primeiroValor;
    private Double segundoValor;

    public void zerarCalculadora() {
        resultado = 0.0;
    }

    public void somar(Double primeiroValor, Double segundoValor){
        resultado = primeiroValor + segundoValor;
    }

    public void subtrair(Double primeiroValor, Double segundoValor) {
        resultado = primeiroValor - segundoValor;
    }

    public void dividir(Double primeiroValor, Double segundoValor) {
        resultado = primeiroValor / segundoValor;
    }

    public void mutiplicar(Double primeiroValor, Double segundoValor) {
        resultado = primeiroValor * segundoValor;
    }

    public Double exibirResultado() {
        return resultado;
    }

    public Calculadora() {
        zerarCalculadora();
    }
}
