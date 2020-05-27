/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=150
 * @author Andre
 */
public class LogInController
{
    //Para criar um controller sera obrigatorio passar uma VIEW.Tela
    private final Login VIEW;
    
    //Ajudante para trazer e levar dados dos objetos
    private LoginHelper helper; 

    //Construtor do Controller, recebe uma VIEW como prametro
    public LogInController(Login VIEW)
    {
        this.VIEW = VIEW;
        
        //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=2086
        this.helper = new LoginHelper(VIEW);
    }
    
    
    //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=914
     //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=1003
    public void entrarNoSistema()
    {     
        //======================================================================================================
        //Pegar um usuario da VIEW
        //======================================================================================================
        //https://youtu.be/flKEjGROQ1o?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=2147        
            Usuario usuario = helper.obterModelo();   
        
        
        
        //======================================================================================================
        //Pesquisar no banco este usuario
        //======================================================================================================
        //https://youtu.be/vV6ENkfLo1s?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=785
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usurioAutenticado = usuarioDAO.selectPorNomeESenha(usuario); //https://youtu.be/vV6ENkfLo1s?list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw&t=820
                
        
        //======================================================================================================
        //Se o usuario da VIEW tiver mmesmo usuario que o usuario vindo do banco liberar acesso, direcionar para menu principal.
        //======================================================================================================
        if (usurioAutenticado != null)
        {
            //Navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            //Mostra a tela do menu...
            menu.setVisible(true);
            
            //Manda fechar a tela de login:
            this.VIEW.dispose();            
        }
        else//Se não : Mostra mensagem "Usuario ou senha inválidos"
        {
          VIEW.exibeMensagem("Usuario ou senha inválidos");
        }
            
    }
    
    
    
    //Regra de negocio do login, os metodos criados, serão chamados na view pelo controller
    //=====================================================================
    public void fizTarefa()
    {
        System.out.println("Conclui a terafa conforme ordenado");
        
        this.VIEW.exibeMensagem("Fiz a tarefa conforme solicitado");
    }
    
    
    
    
}
