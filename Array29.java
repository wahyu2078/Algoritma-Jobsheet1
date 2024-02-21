import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving ",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja "
        };

        double[] nilaiAngka = new double[mataKuliah.length];

        String[] nilaiHuruf = new String[mataKuliah.length];

        double[] bobotNilai = {
            4.00,  // A
            3.50,  // B+
            3.00,  // B
            2.50,  // C+
            2.00,  // C
            1.00,  // D
            0.00   // E
        };

        int[] kredit = { 2, 3, 3, 3, 3, 3, 1, 2 };

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        System.out.println("hasil Konversi Nilai");
        System.out.println("MK\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        double totalBobot = 0;
        double totalKredit = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
            } else {
                nilaiHuruf[i] = "E";
            }

            double bobot = 0;
            for (int j = 0; j < bobotNilai.length; j++) {
                if (nilaiHuruf[i].equals("A") && bobotNilai[j] == 4.00) {
                    bobot = bobotNilai[j];
                } else if (nilaiHuruf[i].equals("B+") && bobotNilai[j] == 3.50) {
                    bobot = bobotNilai[j];
                } else if (nilaiHuruf[i].equals("B") && bobotNilai[j] == 3.00) {
                    bobot = bobotNilai[j];
                } else if (nilaiHuruf[i].equals("C+") && bobotNilai[j] == 2.75) {
                    bobot = bobotNilai[j];
                } else if (nilaiHuruf[i].equals("C") && bobotNilai[j] == 2.50) {
                    bobot = bobotNilai[j];
                } else if (nilaiHuruf[i].equals("D") && bobotNilai[j] == 2.00) {
                    bobot = bobotNilai[j];
                } else if (nilaiHuruf[i].equals("E") && bobotNilai[j] == 0.00) {
                    bobot = bobotNilai[j];
                }
            }

            totalBobot += bobot * kredit[i]; 
            totalKredit += kredit[i];

            System.out.printf("%-30s%-15.2f%-15s%-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobot);
        }

        double ip = totalBobot / totalKredit;
        System.out.println("IP : " + String.format("%.2f", ip));
    }
}
