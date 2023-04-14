import java.util.ArrayList;

public class Banco {

    String cliente;
    int numeroConta;
    double saldo;

    public Banco() {
    }

    public Banco(int numeroConta, double saldo, String CPF) {

        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return saldo += valor;
    }

    public double sacar(double valor){
        return saldo -= valor;
    }


    public void add(ArrayList<Banco> contas) {
    }
}
