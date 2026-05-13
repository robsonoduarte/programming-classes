package klass;

public class conta {
    double saldo = 0;
    double limite = 10;

    void depositar(double deposito) {
        saldo = saldo + deposito;
        if (limite < 10){
            limite = limite + deposito;
        }


    }

    void sacar(double saque) {
        if (saldo >= 0) {
            saldo = saldo - saque;
            if (saldo < 0) {
                limite = limite + saldo;

            }


        } else {
            if (saque<=limite) {
                saldo = saldo - saque;
                limite = limite - saque;
            }
        }


    }


}
