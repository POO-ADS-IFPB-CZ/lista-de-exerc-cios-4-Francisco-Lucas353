package Questão4;
class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double desconto = valor * 0.03;
        double total = valor - desconto;
        System.out.printf("Pagamento com Boleto: Valor = R$ %.2f, Desconto = R$ %.2f, Total = R$ %.2f%n", valor, desconto, total);
    }
}
