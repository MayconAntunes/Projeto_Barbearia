/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author mayco
 */
public class Main_Testes {

    public static void main(String[] args) {
        
        //Cliente cliente = new Cliente("ff", "maycon", 1, "maycon");
        Cliente cliente = new Cliente(01, "Maycon cliente", "Rua dos butias", "85909-050");
        //System.out.println(cliente.getNome());
        
        
        Usuario usuario = new Usuario(1, "Usuario Maycon", "maycon09");
        //System.out.println(usuario.getNome());
        
        Servico servico = new Servico(01, "Serviço 01", 10);
        //System.out.println(servico);
        
        Agendamento agendamento = new Agendamento(01, cliente, servico, 30, "18/03/2020 22:00");
        
        System.out.println(agendamento.getCliente().getNome());
    }

}
