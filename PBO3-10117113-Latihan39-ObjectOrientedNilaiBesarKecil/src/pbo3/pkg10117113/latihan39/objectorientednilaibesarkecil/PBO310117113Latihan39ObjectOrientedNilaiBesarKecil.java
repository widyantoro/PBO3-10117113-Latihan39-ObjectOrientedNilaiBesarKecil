/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan39.objectorientednilaibesarkecil;

import java.util.Scanner;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program menentukan nilai yang paling
 * besar dan paling kecil
 * 
 */
public class PBO310117113Latihan39ObjectOrientedNilaiBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaPetugas;
        int jmlMahasiswa;

        Nilai hasil = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMahasiswa = scn.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMahasiswa);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMahasiswa);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
