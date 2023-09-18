import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double jari_jari, luas, keliling;
        double pi = 3.14;

        System.out.println("Masukkan Nilai Jari-Jari");
        jari_jari=input.nextDouble();
        
        luas = pi * jari_jari * jari_jari;
        keliling = 2 * pi * jari_jari;

        System.out.println("\nHasil Luas Adalah = " +luas);
        System.out.println("Hasil Keliling Adalah = " +keliling);
    }
}
