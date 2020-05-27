/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;


/**
 * ref.: https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1733
 * @author Andre
 */

// Helper são os ajudantes que pegam ou devolvem os dados para a tela
//https://youtu.be/RO-Y9J_0mD0?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=462
public class LoginHelper implements IHelper 
{
    //Helper Deve Ter acesso a view
    private final Login VIEW;

    public LoginHelper(Login VIEW)
    {
        this.VIEW = VIEW;
    }
    
    //Pegar os campos e retornar um obeto usuario com os dados vindos da tela
    public Usuario obterModelo()
    {
        //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1836
        //Pega os campos da da Tela:
        String nome = VIEW.getTextUsuario().getText();
        String senha = VIEW.getTextSenha().getText();
        
        Usuario usuario = new Usuario(0, nome, senha);
        return usuario;      
        
    }
    
    //Devolve um modelo vindo do banco 
    public void setarModelo(Usuario modelo)
    {
        //Pega os campos do modelo:
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=2003
        VIEW.getTextUsuario().setText(nome);
        VIEW.getTextSenha().setText(senha);       
        
    }
    
    //Limpa campos da tela:
    public void limparTela()
    {
        //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=2003
        VIEW.getTextUsuario().setText("");
        VIEW.getTextSenha().setText("");  
    }
    
    
    
    
    
}
