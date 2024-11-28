import java.util.Scanner;

public class SoalDays88 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai yang ingin dicari!");
        int nilai = sc.nextInt();
      
        boolean ditemukan = false;

        for (int angka : array) {
            if (angka == nilai) {
                ditemukan = true;
                break; 
            }
        }

        if (ditemukan) {
            System.out.println("Nilai ditemukan!");
        } else {
            System.out.println("Nilai tidak ditemukan.");
        }

    }
}
