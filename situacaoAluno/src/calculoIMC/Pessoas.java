package calculoIMC;

public class Pessoas<T>{
    public String nome;
    public Double peso;
    public Double altura;
    public double imc;

    public Pessoas() {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

    }

    public double imc () {
        return peso / (altura * altura);
    }



    }



