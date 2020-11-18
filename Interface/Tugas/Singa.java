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
public class Singa extends Binatang implements IKarnivora{
     private String Suara;
    private String warnaBulu;
    public Singa(String Suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.Suara = Suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging");
    }
    @Override
    public void displayBinatang() {
        System.out.println("Singa");
    }
    public void displayData(){
        System.out.println("Jenis: Karnivora");
        this.displayMakan();
        System.out.println("Nama: " + super.nama);
        System.out.println("Jumlah Kaki: " + super.jmlKaki);
        System.out.println("Suara: " + this.Suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println();
    }
}
