public class Days66 {

    // Fungsi untuk mencetak pola persegi
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            String row = ""; 
            for (int j = 0; j < size; j++) {
                row += '*'; 
            }
            System.out.println(row); 
        }
    }

    public static void main(String[] args) {
        printSquare(8); // Menampilkan pola persegi dengan ukuran 8x8
    }
}

class RectanglePrinter {

    // Fungsi untuk mencetak pola persegi panjang
    public static void printRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            String row = ""; 
            for (int j = 0; j < cols; j++) {
                row += '*'; 
            }
            System.out.println(row); 
        }
    }

    public static void main(String[] args) {
        printRectangle(4, 6); // Menampilkan pola persegi panjang dengan ukuran 4x6
    }
}

