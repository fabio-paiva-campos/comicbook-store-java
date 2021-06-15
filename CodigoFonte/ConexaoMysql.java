/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFonte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMysql {

    private final String url;
    private final String user;
    private final String password;
    Connection connection;

    public ConexaoMysql() {
        url = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
        user = "root";
        password = "";
        connection = fazerConexao();
    }

    public final Connection fazerConexao() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.err.println("Erro de conexão com o banco de dado!");
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
