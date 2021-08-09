package calculoIMC;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        Pessoas pessoa = new Pessoas();

        System.out.println("Qual o seu nome? ");
        pessoa.nome = dados.next();
        System.out.println("Qual o seu peso? ");
        pessoa.peso = dados.nextDouble();
        System.out.println("Qual a sua altura? ");
        pessoa.altura = dados.nextDouble();
        Double calculoImc = pessoa.imc();



        System.out.println(calculoImc);
    }

}
