/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author hibrizi
 */

class Prodi {
    private String namaProdi;
    
    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
    }
    
    public String getProdi() {
        return namaProdi;
    }
    
    public void setProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }
}

class Mahasiswa {
    private String namaMahasiswa;
    private Prodi prodi;
    
    public Mahasiswa(String namaMahasiswa, Prodi prodi) {
        this.namaMahasiswa = namaMahasiswa;
        this.prodi = prodi;
    }
    
    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }
    
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }
    
    public Prodi prodi() {
        return prodi;
    }
    
    public void displayMahasiswa() {
        System.out.println("Nama mahasiswa: " +  namaMahasiswa);
        System.out.println("Nama prodi: " + prodi.getProdi());
    }
    
}

public class Main {
    public static void main(String[] args) {
      
        Prodi pr1 = new Prodi("");
        Prodi pr2 = new Prodi("");
        
        pr1.setProdi("Informatika");
        pr2.setProdi("Data Science");
        
        Mahasiswa mhs1 = new Mahasiswa("", pr1);
        Mahasiswa mhs2 = new Mahasiswa("", pr2);
        
        mhs1.setNamaMahasiswa("Bruce Wayne");
        mhs2.setNamaMahasiswa("Tony Stark");
       
        mhs1.displayMahasiswa();
        System.out.println(); 
        mhs2.displayMahasiswa();
    }
}
