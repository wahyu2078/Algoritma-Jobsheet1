import java.util.Scanner;

public class Tugas129 {
    public static void main(String[] args) {
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[] namaKota = {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", 
                             "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = scanner.next().charAt(0);

        String kota = null;
        for (int i = 0; i < kodePlat.length; i++) {
            if (kodePlat[i] == input) {
                kota = namaKota[i];
                break;
            }
        }

        if (kota != null) {
            System.out.println("Plat nomor " + input + " adalah: " + kota);
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
