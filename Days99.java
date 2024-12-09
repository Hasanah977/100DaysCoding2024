import java.util.Scanner;

public class Days99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka1, angka2, pilihan;
        double hasil = 0;

        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih operasi (1-4): ");

        pilihan = sc.nextInt();

        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextInt();

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = (double) angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}




