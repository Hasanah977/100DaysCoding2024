import java.util.Scanner;

public class SoalDays91 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.print("Masukkan angka: "); 
            int angka = scanner.nextInt();

            if (angka % 2 == 0) { 
                System.out.println("Genap"); 
            } else { 
                System.out.println("You and I, end"); 
                break; 
            }
        }
}
}
