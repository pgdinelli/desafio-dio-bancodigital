import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        ListaClientes listaClientes = new ListaClientes();

        listaClientes.adicionarClientes("Paulo", "0024567892");
        listaClientes.listarClientes();

        cc.depositar(100.00);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}