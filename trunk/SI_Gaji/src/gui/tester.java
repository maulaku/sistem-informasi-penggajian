/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.GajiDAO;
import dao.GolonganDAO;
import dao.KaryawanDAO;
import entity.tbGaji;
import entity.tbGolongan;
import entity.tbKaryawan;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dhurand
 */
public class tester {
    public static void main(String[] args) {
        
        //Persistence
        EntityManagerFactory emf;
        EntityManager em = null;
        
        
        try {
            emf = Persistence.createEntityManagerFactory("SI_PenggajianPU");
            em = emf.createEntityManager();
            System.out.println("Running...");
        } catch (Exception e) {
            e.getMessage();
        }
        
//        //Test GolonganDAO
//        GolonganDAO gDAO;
//        tbGolongan g;
//        
//        try {
//            
//            gDAO = new GolonganDAO(em);
//            g = new tbGolongan();
////            tbGolongan g1 = new tbGolongan();
////            tbGolongan g2 = new tbGolongan();
////            tbGolongan g3 = new tbGolongan();
////            tbGolongan g4 = new tbGolongan();
//            
////            g.setGolongan("A1");
////            g.setGajiPokok(100000);
////            g.setPajak(5);
////            g1.setGolongan("A2");
////            g1.setGajiPokok(150000);
////            g1.setPajak(5);
////            g2.setGolongan("A3");
////            g2.setGajiPokok(200000);
////            g2.setPajak(5);
////            g3.setGolongan("A4");
////            g3.setGajiPokok(250000);
////            g3.setPajak(5);
////            g4.setGolongan("A5");
////            g4.setGajiPokok(350000);
////            g4.setPajak(5);
//            
//            //Insert
////            System.out.println(gDAO.insert(g));
////            System.out.println(gDAO.insert(g1));
////            System.out.println(gDAO.insert(g2));
////            System.out.println(gDAO.insert(g3));
////            System.out.println(gDAO.insert(g4));
//            
//            //Update
//            //g.setGolongan("A1");
//            //g.setGajiPokok(500000);
//            //g.setPajak(5);
//            //System.out.println(gDAO.update(1L, g));
//            
//            //Delete
//            g.setId(4l);
//            System.out.println(gDAO.delete(g.getId()));
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
         
        
//        //Tes Karyawan
//        tbKaryawan k;
//        KaryawanDAO kDAO = new KaryawanDAO(em);
//        GolonganDAO gDAO = new GolonganDAO(em);
//        
//        try {
//            k = new tbKaryawan();
//            k.setNama("Agus");
//            k.setGolongan(gDAO.get(3L).getGolongan());
//            
//            //System.out.println(kDAO.insert(k));
//            //System.out.println(kDAO.update(2L, k));
//            //System.out.println(kDAO.delete(2L));
//            
//            //for (int i = 0; i < kDAO.getAll().size(); i++) {
//            //    System.out.println(kDAO.getAll().get(i).getNama());
//            //    System.out.println(kDAO.getAll().get(i).getGolongan());
//                
//            //}
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
//        tbGaji gaji;
//        GolonganDAO golDAO = new GolonganDAO(em);
//        KaryawanDAO karDAO = new KaryawanDAO(em);
//        GajiDAO gjDAO = new GajiDAO(em);
//        
//        try {
//            gaji = new tbGaji();
//            gaji.setNama(karDAO.get(1L).getNama());
//            gaji.setGolongan(karDAO.get(1L).getGolongan());
//            gaji.setGajiPokok(golDAO.get(karDAO.get(1L).getId()).getGajiPokok());
//            gaji.setPajak(golDAO.get(karDAO.get(1L).getId()).getPajak());
//            gaji.setBulan("Juli");
//            gaji.setTunjangan1(100000);
//            gaji.setTunjangan2(100000);
//            gaji.setGajiBersih(gaji.getGajiPokok() + gaji.getTunjangan1() + gaji.getTunjangan2() - ((gaji.getPajak()/100)*(gaji.getGajiPokok())));
//            System.out.println(gjDAO.insert(gaji));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
    }
}
