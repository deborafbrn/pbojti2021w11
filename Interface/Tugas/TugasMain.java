/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Tugas;

/**
 *
 * @author DEBORA
 */
public class TugasMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("HHHHHHHHHH","ABU-ABU","KEDELAI",4);
        Gorila gorila = new Gorila("HAAUM HAUUM","HITAM MUANIS", "GULALIIII",2);
        Singa singa = new Singa("ROOARRRRRRR","COKLATTT","CINGACINGCINGCING",4);

        keledai.displayData();
        gorila.displayData();
        singa.displayData();
    }  
}

