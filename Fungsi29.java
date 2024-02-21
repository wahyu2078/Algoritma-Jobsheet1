public class Fungsi29 {

    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] penguranganStock = {1, 2, 0, 5};

    static void pendapatanPerCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                int stokTersedia = stockBunga[i][j] - penguranganStock[j] >= 0 ? stockBunga[i][j] - penguranganStock[j] : 0;
                pendapatan += stokTersedia * hargaBunga[j];
            }
            System.out.println("Pendapatan cabang RoyalGarden " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    static void stockPerJenisBunga() {
        System.out.println("Jumlah Stock setiap jenis bunga:");
        for (int j = 0; j < jenisBunga.length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stockBunga.length; i++) {
                totalStock += stockBunga[i][j];
            }
            System.out.println(jenisBunga[j] + ": " + totalStock);
        }
    }

    static void penguranganStockBungaMati() {
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] -= penguranganStock[j];
                if (stockBunga[i][j] < 0) {
                    stockBunga[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        pendapatanPerCabang();
        System.out.println();
        stockPerJenisBunga();
        System.out.println();
        penguranganStockBungaMati();
        System.out.println("Bunga mati:");
        stockPerJenisBunga();
    }
}
