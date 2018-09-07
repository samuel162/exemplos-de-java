package matrizaleatorio;

public class MatrizAleatorio {

    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        //Laço de repetição do numero em cada posição

        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C] = 1;
            }
        }
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                System.out.print(matriz[L][C]+" \t");
            }
            System.out.println("");
        }
    }
}
