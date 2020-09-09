/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasidatasiswa.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author User
 */
public class Koneksi {

    public Connection conn;

    public Connection connect() {
        try{
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Berhasil koneksi ke JDBC Driver MySQL");
    }catch(ClassNotFoundException ex){
        System.out.println("Tidak Berhasil Koneksi ke JDBC Driver MySQL");
    }
    //koneksi ke data base
    try{
        String url="jdbc:mysql://localhost:3306/man";
        conn = DriverManager.getConnection(url,"root","");
        System.out.println("Berhasil koneksi ke Database");
    }catch(SQLException e){
        System.out.println("Tidak Berhasil Koneksi ke Database");
    }
    return conn;
    }
}