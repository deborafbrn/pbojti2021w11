/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author DEBORA
 */
public class Rektor {
// INTERFACE    
//    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
         
//        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
//        System.out.println("Selamat! Silahkan perkenalkan diri Anda...");
        
//        mahasiswa.kuliahDiKampus();
//        mahasiswa.lulus();
//        mahasiswa.meraihIPKTinggi();


// MULTIPLE INTERFACE    
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("----------------------------------------------");      
    }
}
