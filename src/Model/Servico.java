/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Andre
 */
public class Servico
{

    private int id;
    private String descricao;
    private float valor;//Para sugerir um valor ao selecionar o tipo de serviço

    public Servico(int id, String descricao, float valor)
    {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public float getValor()
    {
        return valor;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    @Override //Sobrescreve o metodo toString deste objeto.
    public String toString()
    {
        //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1203
        return getDescricao();
    }

}
