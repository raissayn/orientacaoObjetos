package Arrays;public class TesteArrays {

    public static void main(String[] args) {
        // 1. Declarar os arrays
        int[] array1;
        int[] array2;

        // 2. Inicializar array1 com os oito primeiros números primos
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        // 3. Exibir o conteúdo de array1 usando o método exibirArray
        exibirArray(array1);
    }

    // Método para exibir um array de inteiros
    public static void exibirArray(int[] array) {
        System.out.println("Imprimindo array1: ");
        System.out.print("<");
        for (int i = 0; i < array.length; i++) {
            // Imprime um elemento
            System.out.print(array[i]);
            // Imprime uma vírgula como delimitador se não for o último elemento
            if ((i + 1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
