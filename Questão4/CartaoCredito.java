package Questão4;
class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;
        System.out.printf("Pagamento com Cartão de Crédito: Valor = R$ %.2f, Taxa = R$ %.2f, Total = R$ %.2f%n", valor, taxa, total);
    }
}
