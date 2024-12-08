import java.util.Scanner;

public class Days98 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Meminta input dari pengguna untuk batas bawah (x) dan batas atas (y)
        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt(); // Membaca nilai x
        System.out.print("Masukkan nilai y: ");
        int y = sc.nextInt(); // Membaca nilai y

        // Memastikan x lebih kecil dari y dengan menukar nilai jika diperlukan
        if (x > y) {
            int temp = x; // Menyimpan nilai x sementara
            x = y;        // Menukar nilai x dengan y
            y = temp;     // Mengisi y dengan nilai sementara
        }

        // Variabel untuk menyimpan total penjumlahan bilangan genap
        int total = 0;

        // Loop untuk memeriksa setiap bilangan dari x hingga y
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) { // Memeriksa apakah bilangan i genap
                total += i; // Menambahkan bilangan genap ke total
            }
        }

        // Menampilkan hasil penjumlahan bilangan genap
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
