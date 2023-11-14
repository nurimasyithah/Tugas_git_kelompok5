abstract class Person {
    private String nama;    // Atribut untuk menyimpan nama
    private int usia;       // Atribut untuk menyimpan usia

    // Konstruktor untuk inisialisasi objek Person dengan nama dan usia
    public Person(String nama, int usia) {
        this.nama = nama; // Menginisialisasi atribut nama dengan nilai dari parameter nama
        this.usia = usia; // Menginisialisasi atribut usia dengan nilai dari parameter usia
    }

    // Metode getter untuk mendapatkan nama
    public String getNama() {
        return nama; // Mengembalikan nilai dari atribut nama
    }

    // Metode getter untuk mendapatkan usia
    public int getUsia() {
        return usia; // Mengembalikan nilai dari atribut usia
    }
}
