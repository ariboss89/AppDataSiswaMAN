/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasidatasiswa.model;

/**
 *
 * @author User
 */
public class tb_pengguna {
    public static String username;
    public String password;
    public static String nip;
    public String oldPass;
    public static String role;

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        tb_pengguna.role = role;
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        tb_pengguna.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNip() {
        return nip;
    }

    public static void setNip(String nip) {
        tb_pengguna.nip = nip;
    }
}
