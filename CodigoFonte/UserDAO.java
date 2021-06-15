/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFonte;

import java.util.ArrayList;

public interface UserDAO {
    public ArrayList<users> listar();
    public void inserir(users users);
    public void remover(users users);
    public void atualizar(users users);
}