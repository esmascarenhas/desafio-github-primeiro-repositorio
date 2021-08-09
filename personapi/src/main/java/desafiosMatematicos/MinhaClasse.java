package desafiosMatematicos;

import java.io.IOException;
import java.util.Scanner;

public class MinhaClasse<pos, neg, imp, par> {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int par = 0;
        int imp = 0;
        int neg = 0;
        int pos = 0;
        int val = 0;

//continue a solução
        for (int x = 0; x < 5; x++) {
            val = leitor.nextInt();

            if (val % 2 == 0) {par++;}
            else imp++;
            if (val < 0) {neg++;}
            else if {pos++;}
            val = 0;
                  }

    };



//insira suas variaveis corretamente
        System.out.println(par+ " valor(es) par(es)");
        System.out.println(imp+ " valor(es) impar(es)");
        System.out.println(neg+ " valor(es) positivo(s)");
        System.out.println(pos+ " valor(es) negativo(s)");


}


