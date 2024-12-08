import java.util.Scanner;

public class Days98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = sc.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int total = 0;

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }

        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
