import java.util.Arrays;

public class SortingAtlet26 {
    public static void main(String[] args) {

        // Inisialisasi data atlet
        String[][] atletPerCabang = {
            {"Bade_Badminton", "Arya_Badminton", "Canita_Badminton", "Denis_Badminton", "Anies_Badminton"},
            {"Eron_Tenis Meja", "Caraka_Tenis Meja", "Fatoni_Tenis Meja", "Arroldis_Tenis Meja", "Bando_Tenis Meja"},
            {"Alexson_Basket", "Gading_Basket", "Doni_Basket", "Eduard_Basket", "Ilyas_Basket"},
            {"Madonna_Bola Voly", "Drodigo_Bola Voly", "Christo_Bola Voly", "Anto_Bola Voly", "Juminten_Bola Voly"}
        };

        // Sorting nama atlet dalam setiap cabang secara ascending
        for (String[] cabangAtlet : atletPerCabang) {
            Arrays.sort(cabangAtlet);
        }

        // Menampilkan hasil
        for (int i = 0; i < atletPerCabang.length; i++) {
            System.out.println("Cabang " + (i + 1) + ":");
            for (int j = 0; j < atletPerCabang[i].length; j++) {
                System.out.println(atletPerCabang[i][j]);
            }
            System.out.println();
        }
    }
}
