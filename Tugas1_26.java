import java.util.Scanner;

public class Tugas1_26 {
     public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = sc26.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print(" ");
            } 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }   
            System.out.println();
        }
    }
}