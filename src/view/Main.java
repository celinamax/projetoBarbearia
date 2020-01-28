
package View;

import java.text.SimpleDateFormat;
import model.Agendamento;
import model.Cliente;
import model.Pessoa;
import model.Servico;
import model.Usuario;

public class Main {
    
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
        Servico servico = new Servico(1, "corte", 30.00);
        System.out.println("Serviço a ser realizado " + servico.getDescricao() + "  " + "R$" +  servico.getValor());
        
        Cliente cliente = new Cliente( 1, "Noah", "Av Brasil, 500", "38405-278");
        
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Enzo", "123");
        
        System.out.println("Usuário: " + usuario.getNome() + "  " + "Senha: " + usuario.getSenha());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30.00, "30/01/2020 10:50");
        System.out.println("Nome: " + agendamento.getCliente().getNome());
                
    }
    
    
    
}
