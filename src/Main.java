public class Main {
    static final Storage NEW_STORAGE = new Storage();

    public static void main(String[] args) {
        Student s1 = new Student(1, "Ivanov", "Ivan", "Ivanovich", 1988, 5, 23, "Kiev", "+38015432871", "Java", "Elementary", "A");
        Student s2 = new Student(2, "Petrov", "Petr", "Petrovich", 1996, 11, 5, "Lvov", "+38015656541", "Java", "Elementary", "A");
        Student s3 = new Student(3, "Sidorova", "Ekaterina", "Sergeyevna", 2000, 7, 14, "Odessa", "+38098328523", "Java", "Core", "B");
        Student s4 = new Student(4, "Markova", "Tatyana", "Markovna", 1992, 1, 28, "Odessa", "+380925468523", "Python", "Elementary", "A");

        NEW_STORAGE.save(s1);
        NEW_STORAGE.save(s2);
        NEW_STORAGE.save(s3);
        NEW_STORAGE.save(s4);
        System.out.println("Список студентов заданного факультета");
        NEW_STORAGE.getByFaculty("Java");
        System.out.println();
        System.out.println("Списки студентов для каждого факультета и курса");
        NEW_STORAGE.getByFacultyAndCourse();
        System.out.println();
        System.out.println("Список студентов, родившихся после заданного года");
        NEW_STORAGE.getByYear(1992);
        System.out.println();
        System.out.println("Список учебной группы");
        NEW_STORAGE.getByGroup("Java", "Elementary", "A");
    }
}
