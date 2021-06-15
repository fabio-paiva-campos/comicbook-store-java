/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFonte;

import view.TelaPrincipal;

public class LojaHQs {

   
    public static void main(String[] args) {
        DAOFactory factory = new DAOFactory();
        UsuarioDAO pd = factory.CreateDAO();
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setExtendedState(tela.MAXIMIZED_BOTH);
        tela.setVisible(true);
    }
    
}
