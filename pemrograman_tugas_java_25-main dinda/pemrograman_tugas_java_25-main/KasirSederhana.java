/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemrograman_tugas_java_25;

/**
 *
 * @author Cakra
 */
import java.util.Scanner;
// ANGGER CAKRA WICAKSONO NIM 312510054
// TI 25 C1
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga satuan: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon = 0;

        if (total > 100000) {
            diskon = total * 0.10;
        }

        double totalBayar = total - diskon;

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Satuan: Rp" + harga);
        System.out.println("Jumlah Beli : " + jumlah);
        System.out.println("Total Harga : Rp" + total);

        if (diskon > 0) {
            System.out.println("Diskon 10%  : Rp" + diskon);
        } else {
            System.out.println("Diskon      : Tidak ada");
        }

        System.out.println("Total Bayar : Rp" + totalBayar);
    }
}

