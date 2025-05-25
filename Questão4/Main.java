package Questão4;
public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new CartaoCredito(),
            new Boleto(),
            new Pix()
        };

        double valor = 100.00;

        for (Pagamento p : pagamentos) {
            p.processar(valor);
        }
    }
}
