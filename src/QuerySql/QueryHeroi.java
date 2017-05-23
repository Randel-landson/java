/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuerySql;

import ConexaoBanco.ConectaBanco;
import TbHeori.Heroi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Landson
 */
public class QueryHeroi {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rst = null;


    public boolean Delete(Heroi d) {
        conexao = ConectaBanco.getConexao();
        String sql = "DELETE FROM heroi WHERE cod = ? ";
        try {
            pst = conexao.prepareStatement(sql);

            pst.setInt(1, d.getCod());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Heroi apagado com sucesso", "atenção", JOptionPane.INFORMATION_MESSAGE);

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public void altera(Heroi up) {
        conexao = ConectaBanco.getConexao();
        String sql = "update heroi set nome = ? , pode = ?  where cod = ? ";

        try {
            pst = conexao.prepareStatement(sql);

            pst.setString(1, up.getNome());

            pst.setString(2, up.getPode());

            pst.setInt(3, up.getCod());

            int alter = pst.executeUpdate();
            
            if (alter > 0) {
                JOptionPane.showMessageDialog(null, "Heroi aTUALIZADO COM SUECESSO!", "atenção", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Heroi> Mostra() {
        conexao = ConectaBanco.getConexao();

        String sql = "SELECT * FROM heroi ORDER BY nome ASC";

        List<Heroi> listar = new ArrayList<>();

        try {

            pst = conexao.prepareStatement(sql);
            rst = pst.executeQuery();

            while (rst.next()) {
                Heroi h = new Heroi();

                h.setCod(rst.getInt(1));
                h.setNome(rst.getString(2));
                h.setPode(rst.getString(3));

                listar.add(h);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listar;
    }
}
