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
public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;
    public Keledai(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Tumbuhan");
    }
    @Override
    public void displayBinatang() {
        System.out.println("Keledai");
    }
    public void displayData(){
        System.out.println("Jenis: Herbivora");
        this.displayMakan();
        System.out.println("Nama: " + super.nama);
        System.out.println("Jumlah Kaki: " + super.jmlKaki);
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println();
    }
}