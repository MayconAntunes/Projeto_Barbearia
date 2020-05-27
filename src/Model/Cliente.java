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
public class Cliente extends Pessoa
{
    private String endereco;
    private String cep;

    //https://youtu.be/usT0QB_fCK0?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=508

    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone,String email,String rg, String endereco, String cep)
    {
        //Construtor da super class
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String endereco, String cep )
    {
        //Construtor da super class
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getCep()
    {
        return cep;
    }

    public void setCep(String cep)
    {
        this.cep = cep;
    }

    //https://youtu.be/m406f4tGE-E?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=887
    @Override //Sobrescreve o metodo toString deste objeto.
    public String toString()
    {
      
        return getNome();
    }


    
    
}
