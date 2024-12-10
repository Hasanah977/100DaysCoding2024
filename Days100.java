import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Days100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String namaPengguna = scanner.nextLine();

        LocalTime waktuSekarang = LocalTime.now(ZoneId.of("Asia/Makassar")); // Zona WITA
        String salam;

        if (waktuSekarang.isBefore(LocalTime.NOON)) { // Sebelum jam 12:00
            salam = "Selamat pagi";
        } else if (waktuSekarang.isBefore(LocalTime.of(17, 0))) { // Antara jam 12:00 - 17:00
            salam = "Selamat siang";
        } else { // Setelah jam 17:00
            salam = "Selamat malam";
        }

        System.out.println("=================================");
        System.out.println(salam + ", " + namaPengguna);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("=================================");
    }
}