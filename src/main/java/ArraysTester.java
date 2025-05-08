public class ArraysTester {
    public static void main(String[] args) {
        int[] numbers = new int[5];// declarando array
        // arrays são iniciados com 0
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        // iniciando elementos do array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        } // numbers.length limite do array

        // array de String
        String[] names = new String[3];
        System.out.println("----------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        names[0] = "Maria";
        names[1] = "Carla";
        names[2] = "Pedro";

        System.out.println("----------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("----------------------------");
        String[] weekend = {"Saturday","Sunday"};
        /* mesma coisa que
        String [] weekend = new String[2];
        weekend[0] = "Saturday";
        weekend[1] = "Sunday";
         */
        for (int i =0; i < weekend.length; i++) {
            System.out.println(weekend[i]);
        }

        Customer[] customers = new Customer[2];
    }
}
