public class Main {
    public static void main(String[] args) {
        // Membuat objek Student dengan nama "Dimas", usia 18, dan Student ID "2208107060"
        Student student = new Student("Dimas", 18, "2208107060");

        // Membuat objek Teacher dengan nama "Kiki", usia 35, dan Employee ID "T98765"
        Teacher teacher = new Teacher("Kiki", 35, "T98765");

        // Membuat objek Manager dengan nama "Rifa", usia 38, Employee ID "M24680", dan departemen "HR"
        Manager manager = new Manager("Rifa", 38, "M24680", "HR");

        // Membuat objek Engineer dengan nama "Denis", usia 30, Employee ID "E13579", dan spesialisasi "Software Development"
        Engineer engineer = new Engineer("Denis", 30, "E13579", "Software Development");

        // Membuat objek Employee dengan nama "Tom", usia 28, dan Employee ID "W54321"
        Employee employee = new Employee("Tom", 28, "W54321");

        Office office = new Office();

        // Mencetak informasi tentang objek Student menggunakan metode printInfo()
        office.printInfo(student);
        System.out.println("--------------------------");

        // Mencetak informasi tentang objek Teacher menggunakan metode printInfo()
        office.printInfo(teacher);
        System.out.println("--------------------------");

        // Mencetak informasi tentang objek Manager menggunakan metode printInfo()
        office.printInfo(manager);
        System.out.println("--------------------------");

        // Mencetak informasi tentang objek Engineer menggunakan metode printInfo()
        office.printInfo(engineer);
        System.out.println("--------------------------");

        // Mencetak informasi tentang objek Employee menggunakan metode printInfo()
        office.printInfo(employee);
    }
}
