public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 0;

    public ContaPoupanca() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        String extrato = "";
    }
}