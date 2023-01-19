package pl.javastart.task;

public class Person {
    String firstName;
    String lastName;
    int age;
    String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        firstNameException(firstName, "Nieprawidłowe imię  - null lub za krótkie, min. 2 znaki");
        lastNameException(lastName, "Nieprawidłowe nazwisko - null lub za krótkie, min. 2 znaki");
        ageException(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private static void ageException(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Nieprawidłowy wiek");
        }
    }

    private static void lastNameException(String lastName, String message) {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException(message);
        }
    }

    private static void firstNameException(String firstName, String message) {
        lastNameException(firstName, message);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstNameException(firstName, "Nieprawidłowe imię, błąd zmiany  - null lub za krótkie, min. 2 znaki");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastNameException(lastName, "Nieprawidłowe nazwisko, błąd zmiany - null lub za krótkie, min. 2 znaki");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ageException(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
