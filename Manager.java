// Kelas Manager merupakan turunan dari kelas Employee
class Manager extends Employee {
    private String department;

    // Konstruktor untuk inisialisasi objek Manager dengan nama, usia, employeeId, dan department
    public Manager(String nama, int usia, String employeeId, String department) {
        super(nama, usia, employeeId); // Memanggil konstruktor kelas induk (Employee)
        this.department = department; // Menginisialisasi atribut department dengan nilai dari parameter department
    }

    // Metode getter untuk mendapatkan department
    public String getDepartment() {
        return department; // Mengembalikan nilai dari atribut department
    }
}
