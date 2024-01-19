public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        System.out.println(cc.getConta());
        System.out.println(cp.getConta());

        cc.depositar(300.50);
        cp.depositar(200.50);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.sacar(100.00);
        cp.sacar(100.00);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
