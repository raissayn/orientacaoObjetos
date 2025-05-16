package Arrays;
import java.util.Arrays;

public class TesteArrays2 {
    public static void main(String[] args) {
        // Array simples
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = array1;

        // Modifica elementos de índice par de array2
        for (int i = 0; i < array2.length; i += 2) {
            array2[i] = i;
        }

        // Imprime array1 e array2 usando Arrays.toString()
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        // Criar matriz conforme exercício anterior
        int[][] matriz = new int[5][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[i];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }

        // Imprime a matriz usando Arrays.deepToString()
        System.out.println("matriz: " + Arrays.deepToString(matriz));
    }
}
