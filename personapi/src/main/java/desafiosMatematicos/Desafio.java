package desafiosMatematicos;

import java.io.IOException;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println(" Digite um número: ");
        int x = leitor.nextInt();
        int cont = 0;


//continue a solucao de acordo com o solicitado no enunciado

        while ( cont < 6  ) {
            if (x % 2 != 0) {
                System.out.println(x);
                cont ++;
            }
            x++;
        }
    }

}



