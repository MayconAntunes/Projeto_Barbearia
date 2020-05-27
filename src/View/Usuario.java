/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Date;

/**
 *
 * @author maycon.antunes
 */
public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
    private String nivelAcesso;
    private char sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;

    public Usuario(int id, String nome, String senha, String nivelAcesso, char sexo, Date dataNascimento, String telefone, String email, String rg) {
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
    
   // continuar aqui: https://youtu.be/07YuU6JiAA4?t=1106

    public Usuario(int id, String nome, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
