/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MOKLET-2
 */
public class pilihBuku extends Perpustakaan{
    
    private String judul;
    private String kategori;
    private int tahunTerbit;
     
    public pilihBuku (String judul, String kategori, int tahunTerbit, String nama, int usia, String alamat){
        super(nama, usia, alamat);
        this.judul = judul;
        this.kategori = kategori;
        this.tahunTerbit = tahunTerbit;
    }
    public void data(){
        System.out.println("---Data Kunjungan---");
        super.data();
        System.out.println("---Pilih buku---");
        System.out.println("Judul buku : "+this.judul);
        System.out.println("Kategori buku : "+this.kategori);
        System.out.println("Tahun terbit : "+this.tahunTerbit);
    }
}
