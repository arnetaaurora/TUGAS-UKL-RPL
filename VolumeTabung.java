package Tugas_UKL;

import java.util.Scanner;

public class VolumeTabung {
    // fungsi untuk menghitung volume tabung 
    public static double hitungvolume(double r , double t){
        double volume = Math.PI * r * r * t;
        return volume;
        
    }
    
    public static void main (String[] args) {
         Scanner input = new Scanner (System.in);

         System.out.println("Masukkan jari-jari tabung (cm): ");
         double r = input.nextDouble();

         System.out.println("Masukkan tinggi tabung (cm) ");
         double t = input.nextDouble();

         double hasil = hitungvolume(r,t);

         System.out.println("Volume tabung adalah: " + hasil + "cm3");
    }
}
