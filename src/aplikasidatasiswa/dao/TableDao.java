/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasidatasiswa.dao;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TableDao {
    public void SetTabel(JTable tabel, String [][] data, String [] namaKolom, int jmlKolom, int [] lebar){
        tabel.setModel(new DefaultTableModel(data, namaKolom));
        for (int i = 0; i<jmlKolom; i++)
            tabel.getColumnModel().getColumn(i).setPreferredWidth(lebar[i]);
        
    }
}
