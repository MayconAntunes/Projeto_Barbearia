package Servico;

import Model.Agendamento;

/**
 *
 * @author maycon
 */
public class Correio {

    public void NotificarPorEmail(Agendamento agendamento) {
        
        // Função formaada um texto de assunto
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        //Uso da Classe de e-mail
        Email email = new Email("Agendamento Barbearia do Maycon", emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento) {
        
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá " + nomeCliente + " bora dar um tapa no visual gata....  Seu agendamento para " + servico + 
                ", esta marcado para o dia " + dataAgendamento + " as " + horaAgendamento + "H o preço para você vai ficar Uma beleza "
                + "somente R$ " + valor + "0 reais.";
    }

}
