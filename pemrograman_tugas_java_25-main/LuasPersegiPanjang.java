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
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}
