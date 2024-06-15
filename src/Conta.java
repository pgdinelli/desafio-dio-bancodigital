import lombok.Builder;
import lombok.Getter;

@Getter
public abstract class Conta implements ContaBancaria {
    private static final int AGENCIA_PADRAO = 1; //Constante com o número da agência
    private static int SEQUENCIAL = 1; //Constante contadora de contas

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if(!(valor < 0)) {
            saldo -= valor;
        }else{
            throw new RuntimeException("Não é possível sacar um valor negativo!");
        }
    }

    @Override
    public void depositar(double valor) {
        if(!(valor < 0)) {
            saldo += valor;
        }else{
            throw new RuntimeException("Não é possível depositar um valor negativo!");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void operacaoImprimirExtrato(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
