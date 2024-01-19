public interface IConta {
    default void sacar(double valor) {}
    default void depositar(double valor) {}
    default void transferir(IConta contaDestino, double valor) {}
}
