// Kelas Engineer merupakan turunan dari kelas Employee
class Engineer extends Employee {
    private String specialization;

    // Konstruktor untuk inisialisasi objek Engineer dengan nama, usia, employeeId, dan specialization
    public Engineer(String nama, int usia, String employeeId, String specialization) {
        super(nama, usia, employeeId); // Memanggil konstruktor kelas induk (Employee)
        this.specialization = specialization; // Menginisialisasi atribut specialization dengan nilai dari parameter specialization
    }

    // Metode getter untuk mendapatkan specialization
    public String getSpecialization() {
        return specialization; // Mengembalikan nilai dari atribut specialization
    }
}
