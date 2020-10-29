/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasidatasiswa.dao;

import aplikasidatasiswa.controller.Koneksi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class NilaiDao {
    private Koneksi con;
    private PreparedStatement st;
    private ResultSet rs;
    private Statement stmt;
    private String query;
    
    public void Save(String semester, String tahunAjaran, String mapel, String nisn, int nilai, String predikat, int nilai_ketrampilan, String predikat_ketrampilan) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.prepareStatement("insert into tb_nilai(semester, tahun_ajaran, mapel, nisn, nilai, predikat, nilai_ketrampilan, predikat_ketrampilan)values(?,?,?,?,?,?,?,?)");
            st.setString(1, semester);
            st.setString(2, tahunAjaran);
            st.setString(3, mapel);
            st.setString(4, nisn);
            st.setInt(5, nilai);
            st.setString(6, predikat);
            st.setInt(7, nilai_ketrampilan);
            st.setString(8, predikat_ketrampilan);
            
            st.executeUpdate();
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            
        } catch (SQLException ex) {

        }
    }

    public void Update(String nisn, int nilai, String predikat, int nilai_ketrampilan, String predikat_ketrampilan, String mapel, String ta, String semester) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.prepareStatement("UPDATE tb_nilai SET nilai=?, predikat=?, nilai_ketrampilan=?, predikat_ketrampilan=? WHERE nisn =? AND mapel =? AND tahun_ajaran =? AND semester=?");
            st.setInt(1, nilai);
            st.setString(2, predikat);
            st.setInt(3, nilai_ketrampilan);
            st.setString(4, predikat_ketrampilan);
            st.setString(5, nisn);
            st.setString(6, mapel);
            st.setString(7, ta);
            st.setString(8, semester);
            st.executeUpdate();
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
        } catch (SQLException ex) {

        }
    }
}
