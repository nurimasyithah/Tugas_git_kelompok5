class Office {
    // Metode ini mencetak informasi tentang objek Person yang diberikan
    public void printInfo(Person person) {
        System.out.println("Nama: " + person.getNama()); // Mencetak nama dari objek Person
        System.out.println("Usia: " + person.getUsia()); // Mencetak usia dari objek Person

        // Memeriksa tipe objek dan mencetak informasi tambahan sesuai dengan tipe
        if (person instanceof Student) {
            System.out.println("Student ID: " + ((Student) person).getStudentId()); // Jika objek adalah Student, mencetak Student ID
        } else if (person instanceof Teacher) {
            System.out.println("Employee ID: " + ((Teacher) person).getEmployeeId()); // Jika objek adalah Teacher, mencetak Employee ID
        } else if (person instanceof Employee) {
            System.out.println("Employee ID: " + ((Employee) person).getEmployeeId()); // Jika objek adalah Employee, mencetak Employee ID
        }
    }
}
