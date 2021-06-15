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

public class JDBCMysqlUsuarioDAO implements UsuarioDAO {

    ConexaoMysql conexao;

    public JDBCMysqlUsuarioDAO() {
        conexao = new ConexaoMysql();
    }
    
    @Override
    public ArrayList<hqs> listar() {
        ArrayList<hqs> arrHQ = new ArrayList<>();
        String query = "SELECT * from hqs";
        try {
            PreparedStatement preparedStmt = conexao.connection.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();
            hqs hqs;
            while (rs.next()) {
                hqs = new hqs(rs.getString("titulo"),
                              rs.getString("editora"),
                              rs.getString("autor"),
                              rs.getInt("paginas"),
                              rs.getInt("volume"),
                              rs.getString("genero"),
                              rs.getString("capa"));
                hqs.setId(rs.getInt("id"));
                arrHQ.add(hqs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrHQ;
    }

    @Override
    public void inserir(hqs hqs) {
        String query = "insert into hqs (titulo, editora, autor, paginas, volume, genero, capa)"
                + " values (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedstmt = conexao.connection.prepareStatement(query);
            preparedstmt.setString(1, hqs.getTitulo());
            preparedstmt.setString(2, hqs.getEditora());
            preparedstmt.setString(3, hqs.getAutor());
            preparedstmt.setInt(4, hqs.getPaginas());
            preparedstmt.setInt(5, hqs.getVolume());  
            preparedstmt.setString(6, hqs.getGenero());
            preparedstmt.setString(7, hqs.getCapa());
            preparedstmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void remover(hqs hqs) {
        String query = "delete from hqs where id = ?";
        try {
            PreparedStatement preparedstmt = conexao.connection.prepareStatement(query);
            preparedstmt.setInt(1, hqs.getId());
            preparedstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(hqs hqs) {
        String query = "update hqs set titulo = ?, editora = ?, "
                + "autor = ?, paginas = ?, volume = ?, genero = ?, capa = ? where id = ?";

        try {
            PreparedStatement preparedstmt = conexao.connection.prepareStatement(query);
            preparedstmt.setString(1, hqs.getTitulo());
            preparedstmt.setString(2, hqs.getEditora());
            preparedstmt.setString(3, hqs.getAutor());
            preparedstmt.setInt(4, hqs.getPaginas());
            preparedstmt.setInt(5, hqs.getVolume());
            preparedstmt.setString(6, hqs.getGenero());   
            preparedstmt.setString(7, hqs.getCapa());  
            preparedstmt.setInt(8, hqs.getId());
            preparedstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCMysqlUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}