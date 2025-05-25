package Questão5;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
            new Guerreiro("Arthur"),
            new Mago("Harry"),
            new Arqueiro("Robin")
        };

        System.out.println("Início do combate:");


        for (Personagem p : personagens) {
            p.atacar();
        }

        System.out.println("Fim do combate.");
    }
}
