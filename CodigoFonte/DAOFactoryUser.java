/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFonte;

public class DAOFactoryUser {
    public UserDAO CreateDAO(){
        return new JDBCMysqlUserDAO();
    }
}