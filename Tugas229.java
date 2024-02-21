import java.util.Scanner;

public class Tugas229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Menghitung Kecepatan, Jarak, dan Waktu");
        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih rumus yang akan dihitung (1/2/3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    
    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMenghitung Kecepatan");
        System.out.print("Masukkan jarak (s): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = scanner.nextDouble();
        
        double v = s / t;
        System.out.println("Kecepatan (v) = " + v);
    }
    
    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMenghitung Jarak");
        System.out.print("Masukkan kecepatan (v): ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double t = scanner.nextDouble();
        
        double s = v * t;
        System.out.println("Jarak (s) = " + s);
    }
    
    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMenghitung Waktu");
        System.out.print("Masukkan jarak (s): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double v = scanner.nextDouble();
        
        double t = s / v;
        System.out.println("Waktu (t) = " + t);
    }
}


