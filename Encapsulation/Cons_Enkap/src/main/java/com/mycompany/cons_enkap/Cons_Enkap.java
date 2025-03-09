/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cons_enkap;

/**
 *
 * @author hibrizi
 */
public class Cons_Enkap {

    public static void main(String[] args) {
        Pemesanan arrPesan[] = new Pemesanan[5];
        
        Dokter dt1 = new Dokter("Grisha", "Mata");
        Dokter dt2 = new Dokter("Faye", "Gigi");
        Dokter dt3 = new Dokter("Zeke", "Telinga");
        
        Pasien ps1 = new Pasien("Historia", 20);
        Pasien ps2 = new Pasien("Sasha", 37);
        Pasien ps3 = new Pasien("Petra", 55);
        
        arrPesan[0] = new Pemesanan(dt1, ps1, "Selasa");
        arrPesan[1] = new Pemesanan(dt2, ps1, "Kamis");
        arrPesan[2] = new Pemesanan(dt2, ps2, "Selasa");
        arrPesan[3] = new Pemesanan(dt3, ps2, "Jumat");
        arrPesan[4] = new Pemesanan(dt1, ps3, "Senin");
        
        System.out.println("======== Data Pemesanan ========");
        for (int i = 0; i < arrPesan.length; i++) {
            if (arrPesan[i] != null) { 
                System.out.println("Urutan ke-" + (i+1));
                System.out.println("Nama dokter: " + arrPesan[i].getDokter().getNama());
                System.out.println("Spesialis: " + arrPesan[i].getDokter().getSpesialis());
                System.out.println("Nama pasien: " + arrPesan[i].getPasien().getNama());
                System.out.println("Hari: " + arrPesan[i].getHari());
                System.out.println();
            }
        }
    }
}
