package Questão4;
class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento com Pix: Valor = R$ %.2f, Total = R$ %.2f (sem taxas)%n", valor, valor);
    }
}