
// Kelas Employee merupakan turunan dari kelas Person
class Employee extends Person {
    private String employeeId;

    // Konstruktor untuk inisialisasi objek Employee dengan nama, usia, dan employeeId
    public Employee(String nama, int usia, String employeeId) {
        super(nama, usia); // Memanggil konstruktor kelas induk (Person)
        this.employeeId = employeeId; // Menginisialisasi atribut employeeId dengan nilai dari parameter employeeId
    }

    // Metode getter untuk mendapatkan employeeId
    public String getEmployeeId() {
        return employeeId; // Mengembalikan nilai dari atribut employeeId
    }
}
