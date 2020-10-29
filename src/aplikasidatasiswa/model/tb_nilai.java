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
public class tb_nilai {

    public String semester;
    public String tahun_ajaran;
    public String mapel;
    public String nisn;
    public int nilai;
    public String predikat;
    public int nilai_ketrampilan;
    public String predikat_ketrampilan;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTahun_ajaran() {
        return tahun_ajaran;
    }

    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }

    public String getMapel() {
        return mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getPredikat() {
        return predikat;
    }

    public void setPredikat(String predikat) {
        this.predikat = predikat;
    }

    public int getNilai_ketrampilan() {
        return nilai_ketrampilan;
    }

    public void setNilai_ketrampilan(int nilai_ketrampilan) {
        this.nilai_ketrampilan = nilai_ketrampilan;
    }

    public String getPredikat_ketrampilan() {
        return predikat_ketrampilan;
    }

    public void setPredikat_ketrampilan(String predikat_ketrampilan) {
        this.predikat_ketrampilan = predikat_ketrampilan;
    }
}
