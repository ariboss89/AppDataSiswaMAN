/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasidatasiswa.dao;

import Model.tb_login;
import aplikasidatasiswa.controller.Koneksi;
import aplikasidatasiswa.gui.FormMain;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LoginDao {

    private Koneksi con;
    private Statement st;
    private ResultSet res;
    private String query;

    public void Login(String username, String password, String role) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.connect().createStatement();
            res = st.executeQuery("select *from tb_pengguna where username ='" + username + "' And password = '" + password + "' AND role = '"+role+"'");
            if (res.next()) {
                tb_login.setUsername(username);
                JOptionPane.showMessageDialog(null, "Welcome " + username);
                new FormMain().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password is Wrong");
            }
        } catch (SQLException e) {

        }
    }

    public void CekUsername(String username) {
        con = new Koneksi();
        con.connect();
        try {
            Statement st = con.conn.createStatement();
            res = st.executeQuery("select *from tb_pengguna where username = '" + username + "'");
            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Username Already Exist !!");
            }

        } catch (SQLException ex) {

        }
    }

    public void Save(String username, String password ,String nip, String role) {
        con = new Koneksi();
        con.connect();
        
        try {
            st = con.conn.createStatement();
            query = "insert into tb_pengguna(username, password, nip, role)values('" + username + "','" + password + "', '"+nip+"', '"+role+"')";
            st.executeUpdate(query);
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
        } catch (SQLException e) {
        }
    }

    public void Update(String username, String password) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.createStatement();
            query = "update tb_pengguna set password = '" + password + "' where username = '" + username + "'";
            st.executeUpdate(query);
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Password Berhasil di Ganti !!");
        } catch (SQLException e) {

        }
    }

    public void Delete(String username) {
        con = new Koneksi();
        con.connect();
        try {
            st = con.conn.createStatement();
            query = "delete from tb_pengguna where username = '" + username + "'";
            st.executeUpdate(query);
            st.close();
            con.conn.close();
            JOptionPane.showMessageDialog(null, "Data di Hapus");
        } catch (SQLException e) {

        }
    }

    public String[][] Show() {

        res = null;
        String[][] data = null;
        con = new Koneksi();
        con.connect();
        int jumlahBaris = 0;
        try {
            st = con.conn.createStatement();
            query = "SELECT COUNT(username) AS Jumlah FROM tb_pengguna";
            res = st.executeQuery(query);
            if (res.next()) {
                jumlahBaris = res.getInt("Jumlah");
            }
            query = "select *from tb_pengguna order by username Asc";
            res = st.executeQuery(query);
            data = new String[jumlahBaris][2];
            int r = 0;
            while (res.next()) {
                data[r][0] = res.getString("username");
                data[r][1] = res.getString("nip");
                r++;
            }
            int jmlBaris = r;
            String[][] tmpArray = data;
            data = new String[jmlBaris][2];
            for (r = 0; r < jmlBaris; r++) {
                for (int c = 0; c < 2; c++) {
                    data[r][c] = tmpArray[r][c];
                }
            }
            st.close();
            con.conn.close();
        } catch (SQLException e) {
            System.err.println("SQLException : " + e.getMessage());
        }
        return data;
    }

    public String[][] Search(String search) {

        res = null;
        String[][] data = null;
        con = new Koneksi();
        con.connect();
        int jumlahBaris = 0;
        try {
            st = con.conn.createStatement();
            query = "SELECT COUNT(username) AS Jumlah FROM tb_pengguna";
            res = st.executeQuery(query);
            if (res.next()) {
                jumlahBaris = res.getInt("Jumlah");
            }
            query = "select *from tb_pengguna where username like '%" + search + "%'";
            res = st.executeQuery(query);
            data = new String[jumlahBaris][2];
            int r = 0;
            while (res.next()) {
                data[r][0] = res.getString("username");
                data[r][1] = res.getString("nip");
                r++;
            }
            int jmlBaris = r;
            String[][] tmpArray = data;
            data = new String[jmlBaris][2];
            for (r = 0; r < jmlBaris; r++) {
                for (int c = 0; c < 2; c++) {
                    data[r][c] = tmpArray[r][c];
                }
            }
            st.close();
            con.conn.close();
        } catch (SQLException e) {
            System.err.println("SQLException : " + e.getMessage());
        }
        return data;
    }
}
