import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List<Cliente> clientesList = new ArrayList<>();

    public void adicionarClientes(String nomeCliente, String cpf){
        clientesList.add(new Cliente(nomeCliente, cpf));
    }

    public void removerClientes(String nomeCliente, String cpf){
       List<Cliente> clientesParaRemover = new ArrayList<>();
       for(Cliente cl : clientesList){
           if(cl.getNomeCliente().equalsIgnoreCase(nomeCliente) && cl.getCpf().equalsIgnoreCase(cpf)){
               clientesParaRemover.add(cl);
           }
       }
       clientesList.removeAll(clientesParaRemover);
    }

    public void listarClientes() {
        System.out.println(clientesList);
    }
}
