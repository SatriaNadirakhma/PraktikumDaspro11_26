public class StudyCase26 {
    public static void main(String[] args) {
        
        //Tabel Perkalian
        //Satria Rakhmadani - SIB 1E - 26 - 2341760106
        //Studi Kasus ini membuat tabel perkalian dari 1 hingga 10 
        // \t adalah Tab yang berfungsi untuk dikasih jarak

        int i;
        
        System.out.println("=========TABEL PERKALIAN 1 - 10=========");
        System.out.println("========*PELAJARAN SEKOLAH DASAR========");
        
        for (i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}    