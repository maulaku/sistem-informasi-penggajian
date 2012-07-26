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
 * @author Fauzia
 */
@Entity
public class Gaji implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(length=10,nullable=false,unique=true)
    private String kode;
    @Column(nullable=false)
    private String bulan;
    @Column(nullable=false)
    private String nama;
    @Column(nullable=false)
    private String golongan;
    @Column(nullable=false)
    private double gajipokok;
    @Column(nullable=false)
    private double tunjangan1;
    @Column(nullable=false)
    private double tunjangan2;
    @Column(nullable=false)
    private double bonus;
    @Column(nullable=false)
    private double pajak;
    @Column(nullable=false)
    private double gajibersih;

    public double getGajibersih() {
        return gajibersih;
    }

    public void setGajibersih(double gajibersih) {
        this.gajibersih = gajibersih;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public double getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
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
