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
public class Golongan implements Serializable {
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

    @Column(length=10,nullable=false,unique=true)
    private String kodeGolongan;
    @Column(nullable=false)
    private String namaGolongan;
    @Column(nullable=false)
    private double gajiPokok;
    @Column(nullable=false)
    private double pajak;

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getKodeGolongan() {
        return kodeGolongan;
    }

    public void setKodeGolongan(String kodeGolongan) {
        this.kodeGolongan = kodeGolongan;
    }

    public String getNamaGolongan() {
        return namaGolongan;
    }

    public void setNamaGolongan(String namaGolongan) {
        this.namaGolongan = namaGolongan;
    }

    public double getPajak() {
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
    
    
    
}
