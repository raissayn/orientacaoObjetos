public class LeitoDeArgumentos {
        public static void main(String[] args) {
            if (args.length == 0) { // args.length RETORNA os números de argumentos PASSADOS
                System.out.println("Nenhum argumento foi passado.");
            } else {
                System.out.println("Argumentos recebidos:");
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Argumento " + i + ": " + args[i] ); //array de strings
                }
            }
        }

}
