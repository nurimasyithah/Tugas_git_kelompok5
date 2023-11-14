// Kelas Student merupakan turunan dari kelas Person
class Student extends Person {
    private String studentId;

    // Konstruktor untuk inisialisasi objek Student dengan nama, usia, dan studentId
    public Student(String nama, int usia, String studentId) {
        super(nama, usia); // Memanggil konstruktor kelas induk (Person)
        this.studentId = studentId; // Menginisialisasi atribut studentId dengan nilai dari parameter studentId
    }

    // Metode getter untuk mendapatkan studentId
    public String getStudentId() {
        return studentId; // Mengembalikan nilai dari atribut studentId
    }
}
