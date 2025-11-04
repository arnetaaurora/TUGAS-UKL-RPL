package Tugas_UKL;

import java.util.Scanner;

public class HitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan bilangan bulat positif : ");
        int n = input.nextInt();

        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;

        }
        
        System.out.println("Faktorial dari " + n + "adalah: " + hasil);
        

        
    }
    
}
