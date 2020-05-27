/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
//import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class AgendaController {

    private final Agenda view;

    //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=881
    private final AgendaHelper helper; //cria o ajudante

    public AgendaController(Agenda view) {
        this.view = view;

        //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=922
        this.helper = new AgendaHelper(view);
    }

    public void atualizarTabela() {
        //Buscar os agendamentos no Banco
        //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=506
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();//Seria a consulta no banco

        //Exibir esta lista na view
        //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=957
        helper.preencherTabela(agendamentos);

    }

    /**
     * Metoso para carregar o combobox com dados do banco:
     */
    public void atualaizaCliente() {
        //Buscar clientes no banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=279
        ArrayList<Cliente> clientes = clienteDAO.selectAll();

        //Exibir clientes no Combobox cliente
        //Quem ajusta e controla os dados é o Helper
        helper.preencherClientes(clientes);

    }

    /**
     * Metoso para carregar o combobox com dados do banco:
     */
    public void atualaizaServico() {
        //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1035

        //Buscar Servico no banco de dados
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();

        //Exibir servicos no Combobox servico
        //Quem ajusta e controla os dados é o Helper
        helper.preencherServicos(servicos);

    }

    //https://youtu.be/h66FfOpl2Tc?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=225
    public void atualizaValor() {
        //Pega o obejeto selecionado pelo Helper
        Servico servico = helper.obterServico();

        //https://youtu.be/h66FfOpl2Tc?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=425
        helper.setarValor(servico.getValor());

    }

    //https://youtu.be/RO-Y9J_0mD0?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=104
    public void agendar() {
        //Buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModelo();

        //salva o objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);

        //Enviar email
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);

        //Inserir elemento na tabela - Atualziar a tabela:
        atualizarTabela();
        helper.limparTela();

    }

}
