import java.util.Scanner;

public class SoalDays89 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("Masukkan nilai yang ingin dicari! (Ketik 'stop' untuk berhenti)");
            String input = sc.next();

         
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Program dihentikan.");
                break; 
            }

            try {
             
                int nilai = Integer.parseInt(input);
                boolean ditemukan = false;

               
                for (int angka : array) {
                    if (nilai == angka) {
                        ditemukan = true;
                        break; 
                    }
                }

               
                if (ditemukan) {
                    System.out.println("Nilai ditemukan!");
                } else {
                    System.out.println("Nilai tidak ditemukan.");
                }
            } catch (NumberFormatException e) {
               
                System.out.println("Input tidak valid! Masukkan angka atau ketik 'stop' untuk keluar.");
            }
        }

        
    }
}
