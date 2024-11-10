public class Days70 {  // Nama kelas dan kata kunci class

    public void greet(String name) {  // Hapus 'public' yang ganda
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Days70 demo = new Days70();  // Sesuaikan nama kelas dengan instansiasi objek
        demo.greet("prezekc"); // Mengirimkan nilai parameter "prezekc"
    }
}

