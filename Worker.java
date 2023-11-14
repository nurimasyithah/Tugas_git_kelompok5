// Kelas Worker merupakan turunan dari kelas Employee dan mengimplementasikan tiga antarmuka: Workable, Eatable, dan Sleepable.
class Worker extends Employee implements Workable, Eatable, Sleepable {
    public Worker(String nama, int usia, String employeeId) {
        super(nama, usia, employeeId); // Memanggil konstruktor kelas induk (Employee)
    }

    // Implementasi metode work() dari antarmuka Workable
    @Override
    public void work() {
        System.out.println("Working as an employee."); // Mencetak pesan kerja
    }

    // Implementasi metode eat() dari antarmuka Eatable
    @Override
    public void eat() {
        System.out.println("Eating lunch."); // Mencetak pesan saat makan siang
    }

    // Implementasi metode sleep() dari antarmuka Sleepable
    @Override
    public void sleep() {
        System.out.println("Sleeping for rest."); // Mencetak pesan saat istirahat tidur
    }
}
