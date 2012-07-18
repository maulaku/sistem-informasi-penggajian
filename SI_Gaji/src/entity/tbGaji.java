/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dhurand
 */
@Entity
public class tbGaji implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable=false)
    private String nama;
    @Column(nullable=false)
    private String golongan;
    @Column(nullable=false)
    private double gajiPokok;
    @Column(nullable=false)
    private double tunjangan1;
    @Column(nullable=false)
    private double tunjangan2;
    @Column(nullable=false)
    private double pajak;
    @Column(nullable=false)
    private double gajiBersih;
    @Column(nullable=false)
    private String bulan;

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    public void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getPajak() {
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getTunjangan1() {
        return tunjangan1;
    }

    public void setTunjangan1(double tunjangan1) {
        this.tunjangan1 = tunjangan1;
    }

    public double getTunjangan2() {
        return tunjangan2;
    }

    public void setTunjangan2(double tunjangan2) {
        this.tunjangan2 = tunjangan2;
    }
    
    

    
}
