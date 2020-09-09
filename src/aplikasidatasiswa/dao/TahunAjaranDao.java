/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasidatasiswa.dao;

import aplikasidatasiswa.controller.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TahunAjaranDao {
   
    private Koneksi con;
    private Statement st;
    private ResultSet res;
    private String query;
    
    public void Update(String ta) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.createStatement();
            query = "update tb_ta set tahun_ajaran = '" + ta + "' where Id = 1";
            st.executeUpdate(query);
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Password Berhasil di Ganti !!");
        } catch (SQLException e) {

        }
    }
}
