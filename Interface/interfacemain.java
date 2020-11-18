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
import Interface.ICumlaude;
import Interface.Mahasiswa;
import Interface.PascaSarjana;
import Interface.Rektor;
import Interface.Sarjana;

public class interfacemain{
    public static void main(String[] args){
        Rektor pakrektor = new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa ("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}


    

