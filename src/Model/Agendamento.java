/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * https://youtu.be/s7BDXAL83XE?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw
 *
 * @author Andre
 */
public class Agendamento
{

    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String observacao;

    //Construtor com os campos que serao obrigatorios
    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data)
    {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try
        {
            //https://youtu.be/s7BDXAL83XE?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=585
            //Formata a data do tipo String para o formato Date
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
            
        } catch (ParseException ex)
        {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=194
    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String observacao)
    {
        //Faz uma chamado para o proprio construtor
        this(id, cliente, servico, valor, data);

        //https://youtu.be/6wSls9HHmbw?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=304
        this.observacao = observacao;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Servico getServico()
    {
        return servico;
    }

    public void setServico(Servico servico)
    {
        this.servico = servico;
    }

    public float getValor()
    {
        return valor;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    public Date getData()
    {
        return data;
    }

    //https://youtu.be/8n_mkh8_GOA?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1916
    public String getDataFormatada()
    {
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public String getHoraFormatada()
    {
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public String getObservacao()
    {
        return observacao;
    }

    public void setObservacao(String observacao)
    {
        this.observacao = observacao;
    }

}
