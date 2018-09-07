package matrizaleatorio;

import java.util.Random;
import java.util.Scanner;

public class matrizRecado {

    public static void main(String[] args) {
        Random num = new Random();
        Scanner tcl = new Scanner(System.in);
        int matriz[][] = new int[8][7];
        int encontrado = 0;

        //desenvolvimento do codígo
        System.out.println("Digite um valor para realizar a Busca");
        int b = tcl.nextInt();
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C] = num.nextInt(11);
//            Criar minha condição    
                if (b == matriz[L][C]) {
                    System.out.println("Valor encontrado" + matriz[L][C] + " \t");
                    encontrado = 10;
                    break;
                }

            }

        }
        if (encontrado == 0) {
            System.out.println("Valor não encontrado");
        }
    }

}
