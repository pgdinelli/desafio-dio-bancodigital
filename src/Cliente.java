import lombok.Getter;
import lombok.Setter;
//Usando lombok para definir getters e setters
@Getter @Setter
public class Cliente {
    protected String nomeCliente, cpf; //Atributos do cliente

    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: '" +
                  nomeCliente + '\'' +
                ", CPF: '" + cpf + '\'';
    }
}