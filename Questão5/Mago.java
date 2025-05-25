package Questão5;

class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lança uma avadakedabra (40 de dano cursed)");
    }
}
