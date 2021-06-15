/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFonte;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCMysqlUserDAO implements UserDAO {

    ConexaoMysql conexao;

    public JDBCMysqlUserDAO() {
        conexao = new ConexaoMysql();
    }
    
    @Override
    public ArrayList<users> listar() {
        ArrayList<users> arrUsers = new ArrayList<>();
        String query = "SELECT * from users";
        try {
            PreparedStatement preparedStmt = conexao.connection.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();
            users users;
            while (rs.next()) {
                users = new users(rs.getString("login"),
                                  rs.getString("senha"));
                users.setId(rs.getInt("id"));
                arrUsers.add(users);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrUsers;
    }

    @Override
    public void inserir(users users) {
        String query = "insert into users (login, senha)"
                + " values (?, ?)";
        try {
            PreparedStatement preparedstmt = conexao.connection.prepareStatement(query);
            preparedstmt.setString(1, users.getLogin());
            preparedstmt.setString(2, users.getSenha());
            preparedstmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void remover(users users) {
        String query = "delete from users where id = ?";
        try {
            PreparedStatement preparedstmt = conexao.connection.prepareStatement(query);
            preparedstmt.setInt(1, users.getId());
            preparedstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(users users) {
        String query = "update users set login = ?, senha = ? where id = ?";

        try {
            PreparedStatement preparedstmt = conexao.connection.prepareStatement(query);
            preparedstmt.setString(1, users.getLogin());
            preparedstmt.setString(2, users.getSenha());  
            preparedstmt.setInt(3, users.getId());
            preparedstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}