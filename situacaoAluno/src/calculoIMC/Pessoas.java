package calculoIMC;

public class Pessoas<T>{
    public String nome;
    public Double peso;
    public Double altura;

    public Pessoas(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoas() {

    }

    public Double imc(){
        return peso / (altura * altura);
    }


}



