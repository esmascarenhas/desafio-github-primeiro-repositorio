package analiseAprovacaoAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner nota = new Scanner(System.in);

        System.out.println(" Digite a nota da primeira unidade: ");
        a = nota.nextDouble();
        System.out.println(" Digite a nota da segunda unidade: ");
        b = nota.nextDouble();
        System.out.println(" Digite a nota da terceira unidade: ");
        c = nota.nextDouble();
        System.out.println(" Digite a nota da quarta unidade: ");
        d = nota.nextDouble();
        double soma = a + b + c + d;
        double media = soma / 4;
        System.out.println(" A média do Aluno foi de: " + media);
        if (media >= 7d) {
            System.out.println("Parabéns! Você foi aprovado!");}
        else if (media<7 && media >= 5){
            System.out.println("Atenção! Você está na recuperação! ");}

        else if(media <5) {System.out.println("Lamento! Infelizmente você foi reprovado");}
    }

}

