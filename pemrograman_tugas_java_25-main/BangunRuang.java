/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemrograman_tugas_java_25;

/**
 *
 * @author Cakra
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Angger Cakra TI 25 C1 312510054
class BR {
    double volume() {
        return 0;
    }
}

// 1. Kubus
class Kubus extends BR {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double volume() {
        return sisi * sisi * sisi;
    }
}

// 2. Balok
class Balok extends BR {
    double p, l, t;

    Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    double volume() {
        return p * l * t;
    }
}

// 3. Tabung
class Tabung extends BR {
    double r, t;

    Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    double volume() {
        return Math.PI * r * r * t;
    }
}

// 4. Kerucut
class Kerucut extends BR {
    double r, t;

    Kerucut(double r, double t) {
        this.r = r;
        this.t = t;
    }

    double volume() {
        return (1.0/3.0) * Math.PI * r * r * t;
    }
}

// 5. Limas Segiempat
class Limas extends BR {
    double p, l, t;

    Limas(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    double volume() {
        return (1.0/3.0) * p * l * t;
    }
}

// 6. Prisma Segitiga
class Prisma extends BR {
    double alas, tinggiAlas, tinggiPrisma;

    Prisma(double alas, double tinggiAlas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    double volume() {
        return 0.5 * alas * tinggiAlas * tinggiPrisma;
    }
}

// 7. Bola
class Bola extends BR {
    double r;

    Bola(double r) {
        this.r = r;
    }

    double volume() {
        return (4.0/3.0) * Math.PI * r * r * r;
    }
}


// ==== Kelas Main ====
public class BangunRuang {
    public static void main(String[] args) {

        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 3, 2);
        Tabung tabung = new Tabung(7, 10);
        Kerucut kerucut = new Kerucut(7, 10);
        Limas limas = new Limas(6, 4, 8);
        Prisma prisma = new Prisma(6, 4, 10);
        Bola bola = new Bola(7);

        System.out.println("Volume Kubus     : " + kubus.volume());
        System.out.println("Volume Balok     : " + balok.volume());
        System.out.println("Volume Tabung    : " + tabung.volume());
        System.out.println("Volume Kerucut   : " + kerucut.volume());
        System.out.println("Volume Limas     : " + limas.volume());
        System.out.println("Volume Prisma    : " + prisma.volume());
        System.out.println("Volume Bola      : " + bola.volume());
    }
}