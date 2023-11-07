import java.util.Scanner;

public class Triangle26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc26.nextInt();
        int i = 0;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            } 
            i++;
            System.out.println();
        }
    }
}
