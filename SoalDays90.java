import java.util.Scanner;

public class SoalDays90 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Masukkan bilangan genap: ");

        int n = sc.nextInt(); 

        // Validasi input
        if (n <= 0 || n % 2 != 0) {
            System.out.println("Harap masukkan bilangan genap yang positif!");
            
            return;
        }

        long hasil = 1; 
        StringBuilder langkah = new StringBuilder(); 

        for (int i = 1; i <= n; i++) {
            hasil *= i; 
            langkah.append(i); 
            if (i < n) {
                langkah.append(" x "); 
            }
        }

       
        System.out.println(langkah + " = " + hasil);
        
    }
}


