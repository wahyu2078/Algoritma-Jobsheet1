import java.util.HashMap;

public class Fungsi29 {

    static HashMap<String, Integer> hargaBunga = new HashMap<String, Integer>() {{
        put("Aglonema", 75000);
        put("Keladi", 50000);
        put("Alocasia", 60000);
        put("Mawar", 10000);
    }};

    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static HashMap<String, Integer> penguranganStock = new HashMap<String, Integer>() {{
        put("Aglonema", 1);
        put("Keladi", 2);
        put("Alocasia", 0);
        put("Mawar", 5);
    }};

    static void pendapatanPerCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                String jenisBunga = getJenisBunga(j);
                int stokTersedia = stockBunga[i][j] - penguranganStock.getOrDefault(jenisBunga, 0);
                if (stokTersedia > 0) {
                    pendapatan += stokTersedia * hargaBunga.get(jenisBunga);
                }
            }
            System.out.println("Pendapatan cabang RoyalGarden " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    static String getJenisBunga(int index) {
        switch (index) {
            case 0: return "Aglonema";
            case 1: return "Keladi";
            case 2: return "Alocasia";
            case 3: return "Mawar";
            default: return "";
        }
    }

    static void stockPerJenisBunga() {
        HashMap<String, Integer> totalStockPerBunga = new HashMap<>();
        for (int[] cabang : stockBunga) {
            for (int j = 0; j < cabang.length; j++) {
                String jenisBunga = getJenisBunga(j);
                totalStockPerBunga.put(jenisBunga, totalStockPerBunga.getOrDefault(jenisBunga, 0) + cabang[j]);
            }
        }
        System.out.println("Jumlah Stock setiap jenis bunga pada cabang RoyalGarden:");
        for (String jenisBunga : totalStockPerBunga.keySet()) {
            System.out.println(jenisBunga + ": " + totalStockPerBunga.get(jenisBunga));
        }
    }

    static void penguranganStockBungaMati() {
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                String jenisBunga = getJenisBunga(j);
                stockBunga[i][j] -= penguranganStock.getOrDefault(jenisBunga, 0);
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
        System.out.println("Setelah pengurangan stock karena bunga mati:");
        stockPerJenisBunga();
    }
}
