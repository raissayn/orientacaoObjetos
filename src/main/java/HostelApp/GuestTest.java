package HostelApp;

public class GuestTest {
    public static void main(String[] args) {
        Guest g1 = new Guest();
//        g1.firstName = "Joao";
        g1.setFirstName("Joao");
//        g1.lastName = "Maria";
        g1.setLastName("Ribeiro");

        System.out.println("PRIMEIRO NOME: " + g1.getFirstName() + " SEGUNDO NOME: " + g1.getLastName());


    }
}
