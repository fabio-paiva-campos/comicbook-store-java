/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFonte;

import java.util.ArrayList;

public interface UsuarioDAO {
    public ArrayList<hqs> listar();
    public void inserir(hqs hqs);
    public void remover(hqs hqs);
    public void atualizar(hqs hqs);
}
