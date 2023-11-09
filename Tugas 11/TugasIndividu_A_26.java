import java.util.Scanner;

public class TugasIndividu_A_26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Bintang : ");
        int rows = sc26.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}