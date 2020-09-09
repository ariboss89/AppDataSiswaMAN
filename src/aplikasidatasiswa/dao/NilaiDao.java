/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasidatasiswa.dao;

import Controller.DbConnection;
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
    
    public void Save(String semester, String tahunAjaran, String mapel, String nisn, int nilai) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.prepareStatement("insert into tb_nilai(semester, tahun_ajaran, mapel, nisn, nilai)values(?,?,?,?,?)");

            st.setString(1, semester);
            st.setString(2, tahunAjaran);
            st.setString(3, mapel);
            st.setString(4, nisn);
            st.setInt(5, nilai);
            st.executeUpdate();
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            
        } catch (SQLException ex) {

        }
    }

    public void Update(String nisn, int nilai) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.prepareStatement("UPDATE tb_nilai SET nilai=? WHERE nisn =?");
            st.setInt(1, nilai);
            st.setString(2, nisn);
            st.executeUpdate();
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
        } catch (SQLException ex) {

        }
    }
}
