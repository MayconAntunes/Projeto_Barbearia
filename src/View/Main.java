/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Agendamento;
import Model.Cliente;

import Model.Servico;
import Model.Usuario;

/**
 *ref https://youtu.be/07YuU6JiAA4?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=617
 * @author Andre
 * Herança : https://youtu.be/usT0QB_fCK0?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1102
 */
public class Main
{
    public static void main(String[] args)
    {
        //=========================================================================
        Servico servico = new Servico(1, "Barba", 30);
        
        System.out.println(servico.getId());
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        //=========================================================================
        Cliente cliente = new Cliente(1, "Tiago", "Rua Teste", "22234");     
        
        System.out.println(cliente);        
        
        //=========================================================================
        
        Usuario usuario = new Usuario(1, "123456", "Babeiro");
                
        System.out.println(usuario);
      
        //=========================================================================
        
        // https://youtu.be/s7BDXAL83XE?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=957
        Agendamento agendamento = new Agendamento(1, cliente, servico, 50, "10/10/2020 09:23");
        
        //Exemplo de como recuperar o nome de um objeto herdado:
        // https://youtu.be/s7BDXAL83XE?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1033
        System.out.println(agendamento.getCliente().getNome());
        
    }
}
