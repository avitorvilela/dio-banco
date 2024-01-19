public abstract class Conta implements IConta{
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    private double saldo;

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(IConta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getSaldo() {
        return "R$ " + saldo;
    }

    public String getConta() {
        return agencia + " - " + numero;
    }

    public abstract void imprimirExtrato();
}
