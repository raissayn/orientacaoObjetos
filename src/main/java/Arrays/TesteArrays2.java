package Arrays;

public class TesteArrays2 {

    public static void main(String[] args) {
        int[] array1;
        int[] array2;

        // Inicializa array1 com números primos
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        // Atribui array1 a array2 (mesmo endereço de memória)
        array2 = array1;

        // Modifica elementos de índice par em array2
        for (int i = 0; i < array2.length; i += 2) {
            array2[i] = i;
        }

        // Imprime array1
        System.out.print("Conteúdo de array1: ");
        exibirArray(array1);
    }

    public static void exibirArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
