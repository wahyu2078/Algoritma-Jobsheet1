import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");

        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving ",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja "
        };

        double[] nilaiAngka = new double[mataKuliah.length];
        double totalBobot = 0;
        int totalBobotMataKuliah = 0;
        int[] bobot = { 2, 3, 3, 3, 3, 3, 1, 2 };

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            double nilaiBobot;
            if (nilaiAngka[i] >= 80) nilaiBobot = 4.00;
            else if (nilaiAngka[i] >= 73) nilaiBobot = 3.50;
            else if (nilaiAngka[i] >= 65) nilaiBobot = 3.00;
            else if (nilaiAngka[i] >= 60) nilaiBobot = 2.50;
            else if (nilaiAngka[i] >= 50) nilaiBobot = 2.00;
            else if (nilaiAngka[i] >= 39) nilaiBobot = 1.00;
            else nilaiBobot = 0.00;

            totalBobot += nilaiBobot * bobot[i]; 
            totalBobotMataKuliah += bobot[i]; 

            String nilaiHuruf;
            if (nilaiAngka[i] >= 80) nilaiHuruf = "A";
            else if (nilaiAngka[i] >= 73) nilaiHuruf = "B+";
            else if (nilaiAngka[i] >= 65) nilaiHuruf = "B";
            else if (nilaiAngka[i] >= 60) nilaiHuruf = "C+";
            else if (nilaiAngka[i] >= 50) nilaiHuruf = "C";
            else if (nilaiAngka[i] >= 39) nilaiHuruf = "D";
            else nilaiHuruf = "E";

            System.out.printf("%-30s%-15.2f%-15s%-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, nilaiBobot);
        }

        double ip = totalBobot / totalBobotMataKuliah;
        System.out.println("IP : " + String.format("%.2f", ip));
    }
}