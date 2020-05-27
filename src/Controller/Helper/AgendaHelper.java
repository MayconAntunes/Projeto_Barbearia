/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 * https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=757
 * https://youtu.be/RO-Y9J_0mD0?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=579
 * @author maycon
 */
public class AgendaHelper implements IHelper 
{

    private final Agenda view;

    public AgendaHelper(Agenda view)
    {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos)
    {
        //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=987
        //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1078
        DefaultTableModel tableModelo = (DefaultTableModel) view.getTableAgendamentos().getModel();//Converte para o default
        tableModelo.setNumRows(0);

        //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1266
        for (Agendamento agendamento : agendamentos)
        {
            //Tem acesso a dada linha, forEach, Cada linha da tabela é um objeto
            //dessa forma controlo os campos do objeto...
            //adiciona um novo objeto a cada iteração
            //Cada Agendamento sera uma linha nova: um Array de objetos
            tableModelo.addRow(new Object[]
            {
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),//data
                agendamento.getHoraFormatada(),//Hora
                agendamento.getObservacao(),
            });

        }

    }

    //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=558
    public void preencherClientes(ArrayList<Cliente> clientes)
    {
        //Converte em um modelo padrão 
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxCliente().getModel();

        for (Cliente cliente : clientes)
        {
            //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=874
            comboBoxModel.addElement(cliente);//Aqui esta o truque , sobrescrevendo o metodo vai trabalhar com o obejeto com o combobox.
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos)
    {
        //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1129

        //Converte em um modelo padrão 
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxServico().getModel();

        for (Servico servico : servicos)
        {
            //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1185
            comboBoxModel.addElement(servico);//Aqui esta o truque , sobrescrevendo o metodo vai trabalhar com o obejeto com o combobox.
        }
    }

    //https://youtu.be/h66FfOpl2Tc?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=302
    public Servico obterServico()
    {
        //Pega o serciço da tela e devolve um objeto do tipo Serviço:
        return (Servico) view.getjComboboxServico().getSelectedItem();
    }
    
    
     //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=574
    public Cliente obterCliente()
    {
        //Pega o cliente da tela e devolve um objeto do tipo cliente:
        return (Cliente) view.getjComboboxCliente().getSelectedItem();
    }


    //https://youtu.be/h66FfOpl2Tc?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=513
    public void setarValor(float valor)
    {
        view.getTextValor().setText(valor + "");//Concatenando com um texto vazio vira String
    }

    //https://youtu.be/RO-Y9J_0mD0?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=579
    //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=40
    //Vai pegar os campos da tela e montar o objeto agendamento:
    @Override
    public Agendamento obterModelo()
    {
        //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=343
        //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=835
        //Pegar da tela todos os campos que serão necessarios para montar o objeto Agenda: 
        
        //---------------------------------------------------------------------------------------
        //Pegar os campos
        //---------------------------------------------------------------------------------------        
        //Pegar o Campo ID:
        String  idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        
       //Pegar o Campo Cliente:
        Cliente cliente = obterCliente();
        
        //Pegar o Campo Serviço:
        Servico servico = obterServico();
        
        //Pegar o Campo valor:
        String  valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        
        //Pegar o Campo DATA + hora:
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();            
        String dataHora = data + " " + hora;
          
        //Pegar o Campo Observação: Aula 11 22:00
        String observacao = view.getTextObservacao().getText();  
        
        //---------------------------------------------------------------------------------------
        //Pegar os campos
        //--------------------------------------------------------------------------------------- 
        //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=873
        //Montar o objeto agendamento:
        Agendamento agendamento = new Agendamento(id,cliente,servico,valor,dataHora,observacao); 
        return agendamento;
        
    }

    //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=938
    @Override
    public void limparTela()
    {
        //Setar os campos para Vazio:
       view.getTextId().setText("0"); //https://youtu.be/-ok1AKsMNyQ?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=48
       view.getTextFormatedData().setText("");
       view.getTextFormatedHora().setText("");
       view.getTextObservacao().setText("");
       
    }

}
