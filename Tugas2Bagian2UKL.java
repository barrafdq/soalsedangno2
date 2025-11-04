import java.util.Scanner;
public class Tugas2Bagian2UKL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG VOLUME TABUNG ===");
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolumeTabung(r, t);
        System.out.println("Volume tabung = " + volume + " cm³");
    }
    public static double hitungVolumeTabung(double r, double t) {
        return Math.PI * r * r * t;
    }
}
