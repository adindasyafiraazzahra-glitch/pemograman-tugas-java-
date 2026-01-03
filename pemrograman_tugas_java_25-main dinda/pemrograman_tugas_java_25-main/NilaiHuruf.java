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
public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai akhir (0–100): ");
        int nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Huruf mutu: A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Huruf mutu: B");
        } else if (nilai >= 55 && nilai <= 69) {
            System.out.println("Huruf mutu: C");
        } else if (nilai >= 40 && nilai <= 54) {
            System.out.println("Huruf mutu: D");
        } else if (nilai >= 0 && nilai < 40) {
            System.out.println("Huruf mutu: E");
        } else {
            System.out.println("Nilai tidak valid! Harap masukkan antara 0–100.");
        }
    }
}
