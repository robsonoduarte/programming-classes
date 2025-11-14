package klass;

public class conta {
    double saldo = 0;
    double limite = 10;

    void depositar(double deposito) {
        saldo = saldo + deposito;

    }

    void sacar(double saque) {
        if (saldo >= 0) {
            saldo = saldo - saque;

        }/* else {
            if (limite >= saque) {
                limite = limite - saque;

            }
        }*/
        if (saldo < saque) {
            limite = limite + saldo;
        }

    }


}
