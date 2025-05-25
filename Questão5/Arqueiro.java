package Questão5;

class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " dispara uma flecha contra o capitalismo (25 de dano ranged)");
    }
}

