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
public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int jumlahNilai = 5;

        System.out.println("Masukkan 5 nilai tugas:");

        for (int i = 1; i <= jumlahNilai; i++) {
            System.out.print("Nilai ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }
        double rataRata = total / jumlahNilai;

        System.out.println("\nRata-rata nilai tugas adalah: " + rataRata);
    }
}