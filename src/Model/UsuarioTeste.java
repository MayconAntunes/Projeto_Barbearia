/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Andre
 */
public class UsuarioTeste
{
    private int id;
    private String nome;
    private String senha;
    private String nivelAcesso;
    private char sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;

    public UsuarioTeste(int id, String nome, String senha, String nivelAcesso, char sexo, Date dataNascimento, String telefone, String email, String rg)
    {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public UsuarioTeste(int id, String nome, String senha)
    {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public String getNivelAcesso()
    {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso)
    {
        this.nivelAcesso = nivelAcesso;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public Date getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }
    
    

}
