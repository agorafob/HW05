import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String fathersName;
    private Calendar dateOfBirth = new GregorianCalendar();
    private String address;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student() {
    }

    public Student(int id, String surname, String name, String fathersName) {
        setId(id);
        setSurname(surname);
        setName(name);
        setFathersName(fathersName);
    }

    public Student(int id, String surname, String name, String fathersName, int year, int month, int date) {
        this(id, surname, name, fathersName);
        setDateOfBirth(year, month, date);
    }

    public Student(int id, String surname, String name, String fathersName, int year, int month, int date, String address) {
        this(id, surname, name, fathersName, year, month, date);
        setAddress(address);
    }

    public Student(int id, String surname, String name, String fathersName, int year, int month, int date, String address, String phoneNumber) {
        this(id, surname, name, fathersName, year, month, date, address);
        setPhoneNumber(phoneNumber);
    }

    public Student(int id, String surname, String name, String fathersName, int year, int month, int date, String address, String phoneNumber, String faculty) {
        this(id, surname, name, fathersName, year, month, date, address, phoneNumber);
        setFaculty(faculty);
    }

    public Student(int id, String surname, String name, String fathersName, int year, int month, int date, String address, String phoneNumber, String faculty, String course) {
        this(id, surname, name, fathersName, year, month, date, address, phoneNumber, faculty);
        setCourse(course);
    }

    public Student(int id, String surname, String name, String fathersName, int year, int month, int date, String address, String phoneNumber, String faculty, String course, String group) {
        this(id, surname, name, fathersName, year, month, date, address, phoneNumber, faculty, course);
        setGroup(group);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int year, int month, int date) {
        this.dateOfBirth.set(year, month, date);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return getId() + " " + getSurname() + " " + getName() + " " + getFathersName() + " " + getDateOfBirth().get(Calendar.YEAR) + '/' + getDateOfBirth().get(Calendar.MONTH) + '/' + getDateOfBirth().get(Calendar.DATE) +
                " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty() + " " + getCourse() + " " + getGroup();
    }


}
