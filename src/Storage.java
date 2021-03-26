import java.util.Arrays;
import java.util.Calendar;

public class Storage {

    private Student[] storage = new Student[10000];
    private int storageSize = 0;

    public void clear() {
        Arrays.fill(this.storage, null);
        this.storageSize = 0;
        System.out.println("Storage cleared");
    }

    public void save(Student student) {
        this.storage[this.storageSize] = student;
        this.storageSize++;
    }

    public void getByFaculty(String faculty) {
        if (this.storageSize == 0) {
            System.out.println("Storage is empty");
        } else {
            for (int i = 0; i < this.storageSize; i++) {
                if (this.storage[i].getFaculty().equals(faculty)) {
                    System.out.println(this.storage[i].toString());
                }
            }
        }
    }

    public void getByFacultyAndCourse() {
        if (this.storageSize == 0) {
            System.out.println("Storage is empty");
        } else {
            String faculty = "";
            String course = "";
            for (int i = 0; i < this.storageSize; i++) {
                if (!this.storage[i].getFaculty().equals(faculty)) {
                    faculty = this.storage[i].getFaculty();
                    System.out.println("Faculty: " + faculty);
                }
                if (!this.storage[i].getCourse().equals(course)) {
                    course = this.storage[i].getCourse();
                    System.out.println("Course: " + course);
                }
                if ((this.storage[i].getFaculty().equals(faculty)) && (this.storage[i].getCourse().equals(course))) {
                    System.out.println(this.storage[i].toString());
                }
            }
        }
    }

    public void getByYear(int year) {
        if (this.storageSize == 0) {
            System.out.println("Storage is empty");
        } else {
            for (int i = 0; i < this.storageSize; i++) {
                if (this.storage[i].getDateOfBirth().get(Calendar.YEAR) > year) {
                    System.out.println(this.storage[i].toString());
                }
            }
        }
    }

    public void getByGroup(String faculty, String course, String group) {
        if (this.storageSize == 0) {
            System.out.println("Storage is empty");
        } else {
            for (int i = 0; i < this.storageSize; i++) {
                if ((this.storage[i].getFaculty().equals(faculty)) && (this.storage[i].getCourse().equals(course)) && (this.storage[i].getGroup().equals(group))) {
                    System.out.println(this.storage[i].toString());
                }
            }
        }
    }


    public void delete(int id) {
        for (int i = 0; i < this.storageSize; i++) {
            if (this.storage[i].getId() == id) {
                this.storage[i] = this.storage[this.storageSize - 1];
                this.storage[this.storageSize - 1] = null;
                this.storageSize--;
            }
        }
    }

    public Student[] getAll() {
        Student[] allStudent = new Student[this.storageSize];
        if (this.storageSize == 0) {
            System.out.println("Storage is empty");
        } else {
            allStudent = Arrays.copyOf(this.storage, this.storageSize);
        }
        return allStudent;
    }

    public int size() {
        return this.storageSize;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
