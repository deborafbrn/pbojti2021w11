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
public class Gorila extends Binatang implements IHerbivora,IKarnivora{
    private String suara;
    private String warnaBulu;
    public Gorila(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging + Tumbuhan");
    }
    @Override
    public void displayBinatang() {
        System.out.println("Gorilla");
    }
    public void displayData(){
        System.out.println("Jenis: Karnivora + Herbivora");
        this.displayMakan();
        System.out.println("Nama: " + super.nama);
        System.out.println("Jumlah Kak: " + super.jmlKaki);
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println();
    }
}