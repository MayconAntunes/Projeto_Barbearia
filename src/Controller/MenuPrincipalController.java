/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Andre
 */
public class MenuPrincipalController
{
    private final MenuPrincipal VIEW;

    public MenuPrincipalController(MenuPrincipal VIEW)
    {
        this.VIEW = VIEW;
    }

    /**
     * Vai navegar para a agenda
     */
    public void navegarParaAgenda()
    {
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
}
