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
public class Perpustakaan {
    
    private String nama;
    private int umur;
    private String alamat;
    
    public Perpustakaan (String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    public void data(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Umur : "+this.umur);
        System.out.println("Alamat : "+this.alamat);
    }
    
    
}
