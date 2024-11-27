public class Days87 {
    public static void main(String[] args) {
        int[] angka = {2, 25, 06, 20, 02};

        System.out.println("Array sebelum perubahan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        angka[0] = 55;

        System.out.println("\nArray setelah perubahan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
