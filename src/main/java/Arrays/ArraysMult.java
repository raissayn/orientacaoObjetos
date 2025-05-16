package Arrays;

public class ArraysMult {
    public static void main(String[] args) {
        // 1. Declarar matriz com 5 arrays internos
        int[][] matriz = new int[5][];

        // 2. Preencher a matriz
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[i]; // Cria um array interno de tamanho i

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j; // Atribui o valor i * j
            }
        }

        // 3. Exibir cada linha usando exibirArray
        for (int i = 0; i < matriz.length; i++) {
            exibirArray(matriz[i]);
        }
    }

    // Método para exibir arrays de inteiros
    public static void exibirArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
