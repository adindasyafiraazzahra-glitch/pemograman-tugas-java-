/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemrograman_tugas_java_25;

/**
 *
 * @author Cakra
 */
// Kelas Induk
class AlatMusik {
    String nama;

    AlatMusik(String nama) {
        this.nama = nama;
    }

    // Method yang akan dioverride (polimorfisme)
    void bunyi() {
        System.out.println("Alat musik ini menghasilkan bunyi.");
    }
}

// Piano
class Piano extends AlatMusik {
    Piano() { super("Piano"); }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: TING TONG TING ");
    }
}

// Biola
class Biola extends AlatMusik {
    Biola() { super("Biola"); }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: NYIIIING");
    }
}

// Gitar
class Gitar extends AlatMusik {
    Gitar() { super("Gitar"); }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: JRING JRING");
    }
}

// Drum
class Drum extends AlatMusik {
    Drum() { super("Drum"); }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: DUM DUM TAK");
    }
}

// Saxophone
class Saxophone extends AlatMusik {
    Saxophone() { super("Saxophone"); }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: WUUU WUU");
    }
}

// Trumpet
class Trumpet extends AlatMusik {
    Trumpet() { super("Trumpet"); }

    @Override
    void bunyi() {
        System.out.println(nama + " berbunyi: PRUUU PRUU");
    }
}

// Program Utama (Main)
public class Music {
    public static void main(String[] args) {

        // Polimorfisme: objek ditempatkan dalam array bertipe induk
        AlatMusik[] musik = {
            new Piano(),
            new Biola(),
            new Gitar(),
            new Drum(),
            new Saxophone(),
            new Trumpet()
        };

        // Tampilkan bunyi masing-masing
        for (AlatMusik m : musik) {
            m.bunyi();
        }
    }
}