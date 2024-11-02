public class Days62 {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            if (a == 5) {
                break; 
            }
            System.out.println(a);
        }
    }
}

// if (a == 5): Kondisi ini mengecek apakah nilai a sama dengan 5. Ketika a mencapai 5, 
// break akan menghentikan loop.
// break: Memungkinkan loop for untuk berhenti sebelum mencapai batas kondisi (a < 10).