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
        if (calculoImc >= 40) {
            System.out.println("Misericordia! Obesidade Morbida ");
        } else if (calculoImc >= 35 && calculoImc < 40) {
            System.out.println("Vixe! Obesidade Severa ");
        }else if (calculoImc >= 30 && calculoImc < 35) {
            System.out.println("Cuidado! Obesidade ");
        }else if (calculoImc >= 25 && calculoImc < 30) {
            System.out.println("Você está com Sobrepeso ");
        }else if (calculoImc >= 18.5 && calculoImc < 25) {
            System.out.println("Parabéns! Você está no seu peso ideal. ");
        } else if (calculoImc >= 17 && calculoImc < 18.5) {
            System.out.println("Abaixo do Peso ");
        } else {
            System.out.println("Muito abaixo do peso");
        }
    }

}
